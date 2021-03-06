package lt.mif.vu.shop.domain.item;

import java.util.UUID;

public class BulkItem extends Item {
    public BulkItem (double price, String name, String description, int count){
        setPrice(price * count * 0.8);
        setName(name);
        setDescription(description);
        setCount(count);
        setId(UUID.randomUUID());
    }
}
