package lt.mif.vu.shop.domainService.sellerFactory;

import lt.mif.vu.shop.domain.seller.PrivateSeller;
import lt.mif.vu.shop.domain.seller.Seller;
import org.springframework.stereotype.Service;

@Service
public class PrivateSellerFactory implements SellerFactory {

    public Seller createSeller(String fullName, String country) {
        return new PrivateSeller(fullName, country);
    }
}
