package lt.mif.vu.shop.domainService.shopService;

import lt.mif.vu.shop.domain.buyer.Buyer;
import lt.mif.vu.shop.domain.item.Item;
import lt.mif.vu.shop.domain.seller.Seller;

public interface ShopService {

    boolean checkPrice(Item item);

    Buyer serveBuyer(Item item, Buyer buyer);

    boolean checkSellerCountry(Seller seller);
}
