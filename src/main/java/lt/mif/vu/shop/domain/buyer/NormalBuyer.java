package lt.mif.vu.shop.domain.buyer;

import java.util.UUID;

public class NormalBuyer extends Buyer {
    public NormalBuyer(String fullName){
        setFullName(fullName);
        setDiscount(0);
        setWallet(0);
        setId(UUID.randomUUID());
    }
}
