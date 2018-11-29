package lt.mif.vu.shop.facadeService.ItemServiceImp;

import lt.mif.vu.shop.domain.item.Item;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ItemServiceSlowDelivery extends AbstractItemService {

    public Item addNewItem(double price, String name, String description, UUID sellerId) {
        return super.addNewItem(price + 1.5, name, description, 7, sellerId);
    }
}
