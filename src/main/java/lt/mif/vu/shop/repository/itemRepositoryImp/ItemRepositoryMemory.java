package lt.mif.vu.shop.repository.itemRepositoryImp;

import lt.mif.vu.shop.Integrational.mailListener.MailListener;
import lt.mif.vu.shop.domain.item.Item;
import lt.mif.vu.shop.repository.itemRepository.ItemRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class ItemRepositoryMemory implements ItemRepository {

    List<Item> items = new ArrayList<>();

    public List<Item> findBySellerId(UUID sellerId) {
        return items.stream().filter(item -> item.getSeller().getId().equals(sellerId)).collect(Collectors.toList());
    }

    public List<Item> findAll() {
        return items;
    }

    public Optional<Item> findById(UUID id) {
        return items.stream().filter(item -> item.getId().equals(id)).findAny();
    }

    public Item save(Item item) {
        items.add(item);
        return item;
    }

    public Optional<Item> delete(Item item) {
        if (items.contains(item)){
            items.remove(item);
            return Optional.of(item);
        }
        return Optional.empty();
    }

    public Optional<Item> update(Item item) {

        Item it = findById(item.getId()).orElse(null);
        if (it == null){
            return Optional.empty();
        }
        items.remove(it);
        items.add(item);
        return Optional.of(item);
    }
    public void  emailWasSent(String message, String receiver){
        System.out.println("registering that email to " + receiver +  " was sent");
    }
}
