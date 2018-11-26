package lt.mif.vu.shop.model.seller;

import java.util.Date;
import java.util.UUID;

public class CompanySeller extends Seller {
    public CompanySeller (String companyName, String country) {
        setId(UUID.randomUUID());
        setCreatedAt(new Date());
        setUpdatedAt(new Date());
        setName(companyName);
        setCountry(country);
    }
}
