package lt.mif.vu.shop.model.buyer;

public class NormalBuyer extends Buyer {
    public NormalBuyer(String fullName){
        setFullName(fullName);
        setDiscount(0);
        setWallet(0);
    }
}
