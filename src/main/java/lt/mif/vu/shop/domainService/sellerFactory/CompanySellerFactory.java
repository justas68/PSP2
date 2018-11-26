package lt.mif.vu.shop.domain.seller;

public class CompanySellerFactory implements  SellerFactory {

    public Seller getSeller(String companyName, String country){
        return new CompanySeller(companyName, country);
    }
}
