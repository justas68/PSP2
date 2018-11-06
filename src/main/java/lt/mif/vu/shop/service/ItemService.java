package lt.mif.vu.shop.service;

import lt.mif.vu.shop.model.Item;
import java.util.List;
import java.util.UUID;

public interface ItemService {

    List<Item> searchForItem(String name);

    Item addNewItem(double price, String name, String description);

    List<Item> findAllItems();

    Item sellItem(Item item);

    Item findItem(UUID id);

    Item updateItem(UUID id, Item item);

}
