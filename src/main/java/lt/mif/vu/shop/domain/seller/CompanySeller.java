package lt.mif.vu.shop.domain.seller;

import java.util.Date;
import java.util.UUID;

public class CompanySeller extends Seller {
    public CompanySeller (String companyName, String country) {
        setId(UUID.randomUUID());
        setName(companyName);
        setCountry(country);
    }
}
