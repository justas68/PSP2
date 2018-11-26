package lt.mif.vu.shop.repository;

import lt.mif.vu.shop.domain.buyer.Buyer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class BuyerRepositoryMemory implements BuyerRepository {

    private List<Buyer> buyers = new ArrayList<>();

    public List<Buyer> getAll() {
        return buyers;
    }

    public Buyer save(Buyer buyer) {
        buyers.add(buyer);
        return buyer;
    }

    public Optional<Buyer> delete(Buyer buyer) {
       if (buyers.contains(buyer)){
           buyers.remove(buyer);
           return Optional.of(buyer);
       }
       return Optional.empty();
    }

    public Optional<Buyer> update(Buyer buyer) {
        Buyer buy = findById(buyer.getId()).orElse(null);
        if (buy == null){
            return Optional.empty();
        }
        buyers.remove(buy);
        buyers.add(buyer);
        return Optional.of(buyer);
    }

    public Optional<Buyer> findById(UUID id) {
        return buyers.stream().filter(buyer -> buyer.getId().equals(id)).findAny();
    }
}
