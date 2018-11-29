package lt.mif.vu.shop.domainService.sellerFactory;

import lt.mif.vu.shop.domain.seller.Seller;

public interface SellerFactory {

    Seller createSeller(String name, String country);
}
