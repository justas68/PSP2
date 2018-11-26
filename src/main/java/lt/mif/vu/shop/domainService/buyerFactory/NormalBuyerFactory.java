package lt.mif.vu.shop.domain.buyer;

public class NormalBuyerFactory implements BuyerFactory {

    public Buyer getBuyer(String fullName) {

        return new NormalBuyer(fullName);
    }
}
