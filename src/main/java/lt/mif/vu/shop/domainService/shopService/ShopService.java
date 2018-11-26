package lt.mif.vu.shop.domainService.shopService;

import lt.mif.vu.shop.domain.buyer.Buyer;
import lt.mif.vu.shop.domain.item.Item;

public interface ShopService {

    boolean checkPrice(Item item);

    Buyer serveBuyer(Item item, Buyer buyer);

    void test();

}
