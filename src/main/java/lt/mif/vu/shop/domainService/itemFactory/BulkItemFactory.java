package lt.mif.vu.shop.domainService.itemFactory;

import lt.mif.vu.shop.domain.item.BulkItem;
import lt.mif.vu.shop.domain.item.Item;
import org.springframework.stereotype.Service;

@Service
public class BulkItemFactory implements ItemFactory {

    public Item createItem(double price, String name, String description) {
        return new BulkItem(price, name, description, 50);
    }
}
