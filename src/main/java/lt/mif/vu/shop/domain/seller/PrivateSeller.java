package lt.mif.vu.shop.domain.seller;

import java.util.Date;
import java.util.UUID;

public class PrivateSeller extends Seller {
    public PrivateSeller (String fullName, String country){
        setId(UUID.randomUUID());
        setName(fullName);
        setCountry(country);
    }
}
