package lt.mif.vu.shop.domainService.buyerFactory;

import lt.mif.vu.shop.domain.buyer.Buyer;
import lt.mif.vu.shop.domain.buyer.VipBuyer;
import org.springframework.stereotype.Service;

@Service
public class VipBuyerFactory implements BuyerFactory {

    public Buyer createBuyer(String fullName) {
        return new VipBuyer(fullName);
    }
}
