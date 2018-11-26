package lt.mif.vu.shop.domain.buyer;

public class VipBuyerFactory implements BuyerFactory {

    public Buyer getBuyer(String fullName) {
        return new VipBuyer(fullName);
    }
}
