package lt.mif.vu.shop.domain.seller;

public class PrivateSellerFactory implements SellerFactory {

    public Seller getSeller(String fullName, String country) {
        return new PrivateSeller(fullName, country);
    }
}
