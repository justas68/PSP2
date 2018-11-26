package lt.mif.vu.shop.facadeService.itemService;

import lt.mif.vu.shop.Integrational.mailListener.MailListener;
import lt.mif.vu.shop.facadeService.itemService.ItemService;
import lt.mif.vu.shop.repository.BuyerRepository;
import lt.mif.vu.shop.repository.ItemRepository;
import lt.mif.vu.shop.Integrational.mailSencer.MessageSender;
import lt.mif.vu.shop.repository.SellerRepository;
import lt.mif.vu.shop.domainService.shopService.ShopService;
import lt.mif.vu.shop.domain.buyer.Buyer;
import lt.mif.vu.shop.domain.item.Item;
import lt.mif.vu.shop.domainService.itemFactory.ItemFactory;
import lt.mif.vu.shop.domain.seller.Seller;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractItemService implements ItemService{

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private BuyerRepository buyerRepository;

    @Autowired
    private ItemFactory itemFactory;

    @Autowired
    private ShopService shopService1;

    @Autowired
    private MessageSender messageSender;


    public List<Item> searchForItem(String name) {
        List<Item> items = findAllItems();
        return items.stream().filter(item -> replaceLetters(item.getName().toLowerCase()).contains(replaceLetters(name))).collect(Collectors.toList());
    }

    public Item addNewItem(double price, String name, String description, int deliveryTime, UUID sellerId) {
        shopService1.test();
        Item item = itemFactory.getItem(price, name, description);
        item.setDeliveryTime(deliveryTime);
        Seller seller = sellerRepository.findById(sellerId).orElse(null);
        if (!shopService1.checkPrice(item)){
            return null;
        }
        if (seller != null){
            item.setSeller(seller);
            itemRepository.save(item);
            return item;
        }
        return null;
    }

    public List<Item> findAllItems() {

        return (List<Item>) itemRepository.findAll();
    }

    public Item sellItem(UUID id, UUID buyerId) {
        Item item = findItem(id);
        if (item == null){
            return null;
        }
        Buyer buyer = buyerRepository.findById(buyerId).orElse(null);
        if (buyer == null){
            return null;
        }
        buyer = shopService1.serveBuyer(item, buyer);
        if (buyer == null){
            return null;
        }
        buyerRepository.update(buyer);
        itemRepository.delete(item);
        messageSender.sendMessage("client " + buyer.getFullName() + "bought " + item.getName(), "justastvarijonas@gmail.com");
        return item;
    }

    public Item updateItem(UUID id, double price, String name, String description){
        Item it = findItem(id);
        it.setName(name);
        it.setDescription(description);
        it.setPrice(price);
        return itemRepository.save(it);
    }
    public Item findItem(UUID id) { return itemRepository.findById(id).orElse(null); }


    public String replaceLetters(String s){

        s = s.replaceAll("ą", "a");
        s = s.replaceAll("č", "c");
        s = s.replaceAll("ė", "e");
        s = s.replaceAll("ę", "e");
        s = s.replaceAll("ų", "u");
        s = s.replaceAll("š", "s");
        s = s.replaceAll("į", "i");
        s = s.replaceAll("ū", "u");

        return s;
    }
}
