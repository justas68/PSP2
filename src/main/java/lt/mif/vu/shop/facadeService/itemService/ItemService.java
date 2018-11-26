package lt.mif.vu.shop.facadeService;

import lt.mif.vu.shop.domain.item.Item;
import java.util.List;
import java.util.UUID;

public interface ItemService {

    List<Item> searchForItem(String name);

    Item addNewItem(double price, String name, String description, UUID sellerId);

    List<Item> findAllItems();

    Item sellItem(UUID id, UUID buyerId);

    Item findItem(UUID id);

    Item updateItem(UUID id, double price, String name, String description);

}
