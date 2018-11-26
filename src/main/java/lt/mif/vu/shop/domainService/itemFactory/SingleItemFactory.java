package lt.mif.vu.shop.domain.item;

public class SingleItemFactory implements ItemFactory {

    public Item getItem(double price, String name, String description) {
        return new SingleItem(price, name, description);
    }
}
