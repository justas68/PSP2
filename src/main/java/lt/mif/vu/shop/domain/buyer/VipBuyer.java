package lt.mif.vu.shop.domain.buyer;

import java.util.UUID;

public class VipBuyer extends Buyer{
    public VipBuyer(String fullName){
        setFullName(fullName);
        setDiscount(0.1);
        setWallet(20);
        setId(UUID.randomUUID());
    }
}
