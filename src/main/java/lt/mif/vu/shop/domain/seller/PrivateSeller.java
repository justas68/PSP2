package lt.mif.vu.shop.model.seller;

import java.util.Date;
import java.util.UUID;

public class PrivateSeller extends Seller {
    public PrivateSeller (String fullName, String country){
        setId(UUID.randomUUID());
        setCreatedAt(new Date());
        setUpdatedAt(new Date());
        setName(fullName);
        setCountry(country);
    }
}
