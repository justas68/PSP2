package lt.mif.vu.shop.facadeService;

import lt.mif.vu.shop.repository.BuyerRepository;
import lt.mif.vu.shop.domain.buyer.Buyer;
import lt.mif.vu.shop.domainService.buyerFactory.BuyerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BuyerServiceImp implements BuyerService {

    @Autowired
    BuyerRepository buyerRepository;

    @Autowired
    BuyerFactory buyerFactory;


    public List<Buyer> getAllBuyers() {
       return buyerRepository.getAll();
    }

    public Buyer getBuyerById(UUID id) {
        return getBuyerById(id);
    }

    public Buyer updateBuyer(UUID id, String name, double Wallet) {
        Buyer buyer = buyerRepository.findById(id).orElse(null);
        if (buyer == null){
            return null;
        }
        buyer.setFullName(name);
        buyer.setWallet(buyer.getWallet() + Wallet);
        buyerRepository.update(buyer);
        return buyer;
    }

    public Buyer addBuyer(String name) {
        Buyer buyer = buyerFactory.getBuyer(name);
        buyerRepository.save(buyer);
        //
        return buyer;
    }

    public Buyer deleteBuyer(UUID id) {
        Buyer buyer = buyerRepository.findById(id).orElse(null);
        if (buyer == null){
            return null;
        }
        buyerRepository.delete(buyer);
        return buyer;
    }
}
