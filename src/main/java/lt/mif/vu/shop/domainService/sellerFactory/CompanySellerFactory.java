package lt.mif.vu.shop.domainService.sellerFactory;

import lt.mif.vu.shop.domain.seller.CompanySeller;
import lt.mif.vu.shop.domain.seller.Seller;
import org.springframework.stereotype.Service;

@Service
public class CompanySellerFactory implements  SellerFactory {

    public Seller createSeller(String companyName, String country){
        return new CompanySeller(companyName, country);
    }
}
