package lt.mif.vu.shop.domain.item;

import java.util.UUID;

public class SingleItem extends Item {
    public SingleItem (double price, String name, String description){
        setPrice(price);
        setName(name);
        setDescription(description);
        setCount(1);
        setId(UUID.randomUUID());
    }
}
