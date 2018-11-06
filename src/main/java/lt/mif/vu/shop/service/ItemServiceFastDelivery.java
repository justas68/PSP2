package lt.mif.vu.shop.service;

import lt.mif.vu.shop.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceFastDelivery extends AbstarctItemService{

    public Item addNewItem(double price, String name, String description) {
        return super.addNewItem(price + 4.5, name, description, 3);
    }
}
