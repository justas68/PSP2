package lt.mif.vu.shop.repository;

import lt.mif.vu.shop.domain.buyer.Buyer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BuyerRepository {

    List<Buyer> getAll();

    Buyer save (Buyer buyer);

    Optional<Buyer> delete (Buyer buyer);

    Optional<Buyer> update (Buyer buyer);

    Optional<Buyer> findById (UUID id);

}
