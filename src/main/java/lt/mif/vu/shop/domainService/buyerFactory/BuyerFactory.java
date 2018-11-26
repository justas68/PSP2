package lt.mif.vu.shop.domainService.buyerFactory;

import lt.mif.vu.shop.domain.buyer.Buyer;

public interface BuyerFactory {
    Buyer createBuyer(String fullName);
}
