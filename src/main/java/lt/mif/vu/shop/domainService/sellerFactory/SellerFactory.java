package lt.mif.vu.shop.domain.seller;

public interface SellerFactory {

    Seller getSeller (String name, String country);
}
