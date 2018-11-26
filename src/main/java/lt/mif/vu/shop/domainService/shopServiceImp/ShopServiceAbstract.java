package lt.mif.vu.shop.domainService.shopServiceImp;

import lt.mif.vu.shop.domain.buyer.Buyer;
import lt.mif.vu.shop.domain.item.Item;
import lt.mif.vu.shop.domainService.shopService.ShopService;

public abstract class ShopServiceAbstract implements ShopService{
    public boolean checkPrice(Item item) {
        if (item.getPrice() < 0) {
            return false;
        }
        return true;
    }

    public Buyer serveBuyer(Item item, Buyer buyer) {
        double price = item.getPrice() - item.getPrice() * buyer.getDiscount();
        if (buyer.getWallet() < price){
            return null;
        }
        buyer.setWallet(buyer.getWallet()-price);
        return buyer;
    }
}
