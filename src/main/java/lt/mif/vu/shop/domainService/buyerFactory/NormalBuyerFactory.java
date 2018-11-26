package lt.mif.vu.shop.domainService.buyerFactory;

import lt.mif.vu.shop.domain.buyer.Buyer;
import lt.mif.vu.shop.domain.buyer.NormalBuyer;
import org.springframework.stereotype.Service;

@Service
public class NormalBuyerFactory implements BuyerFactory {

    public Buyer createBuyer(String fullName) {

        return new NormalBuyer(fullName);
    }
}
