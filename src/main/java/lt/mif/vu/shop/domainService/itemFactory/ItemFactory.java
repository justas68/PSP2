package lt.mif.vu.shop.domainService.itemFactory;

import lt.mif.vu.shop.domain.item.Item;

public interface ItemFactory {

    Item getItem(double price, String name, String description);

}
