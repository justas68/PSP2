package lt.mif.vu.shop.service;

import lt.mif.vu.shop.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceSlowDelivery extends AbstarctItemService {

    public Item addNewItem(double price, String name, String description) {
        return super.addNewItem(price + 1.5, name, description, 7);
    }
}
