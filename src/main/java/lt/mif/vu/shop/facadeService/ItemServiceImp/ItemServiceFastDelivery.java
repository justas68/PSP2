package lt.mif.vu.shop.facadeService;

import lt.mif.vu.shop.domain.item.Item;

import java.util.UUID;

public class ItemServiceFastDelivery extends AbstractItemService {
    public Item addNewItem(double price, String name, String description, UUID sellerId) {
        return super.addNewItem(price + 4.5, name, description, 3, sellerId);
    }
}
