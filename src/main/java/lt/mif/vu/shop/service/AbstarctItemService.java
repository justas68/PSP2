package lt.mif.vu.shop.service;

import lt.mif.vu.shop.model.Item;
import lt.mif.vu.shop.repository.ItemRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstarctItemService implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> searchForItem(String name) {
        List<Item> items = findAllItems();
        return items.stream().filter(item -> replaceLetters(item.getName().toLowerCase()).contains(replaceLetters(name))).collect(Collectors.toList());
    }

    public Item addNewItem(double price, String name, String description, int deliveryTime) {
        Item item = new Item();
        item.setPrice(price);
        item.setDescription(description);
        item.setName(name);
        item.setDeliverytime(deliveryTime);
        item.setId(UUID.randomUUID());
        itemRepository.save(item);
        return item;
    }

    public List<Item> findAllItems() {
        return (List<Item>)itemRepository.findAll();
    }

    public Item sellItem(Item item) {
        itemRepository.delete(item);
        return item;
    }

    public Item updateItem(UUID id, Item item){
        Item it = findItem(id);
        //itemRepository.delete(it);
        it.setName(item.getName());
        it.setDescription(item.getDescription());
        it.setPrice(item.getPrice());
        return itemRepository.save(it);
    }
    public Item findItem(UUID id) {
        return itemRepository.findById(id).orElse(null);
    }

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
