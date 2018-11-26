package lt.mif.vu.shop.domainService.sellerFactory;

import lt.mif.vu.shop.domain.seller.Seller;

public interface SellerFactory {

    Seller getSeller (String name, String country);
}
