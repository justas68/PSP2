package lt.mif.vu.shop.domain.item;

public class BulkItemFactory implements ItemFactory {

    public Item getItem(double price, String name, String description) {
        return new BulkItem(price, name, description, 50);
    }
}
