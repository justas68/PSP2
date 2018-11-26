package lt.mif.vu.shop.repository;

import lt.mif.vu.shop.domain.seller.Seller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class SellerRepositoryMemory implements SellerRepository {

    private List<Seller> sellers = new ArrayList<>();

    public List<Seller> getAll() {
        return sellers;
    }

    public Seller save(Seller seller) {
        sellers.add(seller);
        return seller;
    }

    public Optional<Seller> delete(Seller seller) {
        if (sellers.contains(seller)) {
            sellers.remove(seller);
            return Optional.of(seller);
        }
        return Optional.empty();
    }

    public Optional<Seller> update(Seller seller) {
        for (Seller sell : sellers){
            if (sell.getId().equals(seller.getId())){
                sellers.remove(sell);
                sellers.add(seller);
                return Optional.of(seller);
            }
        }
        return Optional.empty();
    }

    public Optional<Seller> findById(UUID id) {
        return sellers.stream().filter(seller -> seller.getId().equals(id)).findAny();
    }
}
