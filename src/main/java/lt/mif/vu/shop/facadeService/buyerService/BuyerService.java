package lt.mif.vu.shop.facadeService.buyerService;

import lt.mif.vu.shop.domain.buyer.Buyer;

import java.util.List;
import java.util.UUID;

public interface BuyerService {

    List<Buyer> getAllBuyers();

    Buyer getBuyerById(UUID id);

    Buyer updateBuyer(UUID id, String name, double wallet);

    Buyer registerBuyer(String name);

    Buyer deleteBuyer(UUID id);
}
