package lt.mif.vu.shop.domainService.itemFactory;

import lt.mif.vu.shop.domain.item.Item;
import lt.mif.vu.shop.domain.item.SingleItem;
import org.springframework.stereotype.Service;

@Service
public class SingleItemFactory implements ItemFactory {

    public Item createItem(double price, String name, String description) {
        return new SingleItem(price, name, description);
    }
}
