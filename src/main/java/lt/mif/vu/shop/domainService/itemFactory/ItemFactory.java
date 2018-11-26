package lt.mif.vu.shop.domain.item;

public interface ItemFactory {

    Item getItem(double price, String name, String description);

}
