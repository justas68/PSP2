package lt.mif.vu.shop.repository;

import lt.mif.vu.shop.domain.seller.Seller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SellerRepository {

    List<Seller> getAll();

    Seller save (Seller seller);

    Optional<Seller> delete (Seller seller);

    Optional<Seller> update (Seller seller);

    Optional<Seller> findById (UUID id);

}
