package lt.mif.vu.shop.model.item;

public class SingleItem extends Item {
    public SingleItem (double price, String name, String description){
        setPrice(price);
        setName(name);
        setDescription(description);
        setCount(1);
    }
}
