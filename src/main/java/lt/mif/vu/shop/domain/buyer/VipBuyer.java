package lt.mif.vu.shop.model.buyer;

public class VipBuyer extends Buyer{
    public VipBuyer(String fullName){
        setFullName(fullName);
        setDiscount(0.1);
        setWallet(20);
    }
}
