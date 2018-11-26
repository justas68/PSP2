package lt.mif.vu.shop.repository;

import lt.mif.vu.shop.domain.item.Item;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ItemRepository {

    List<Item> findBySellerId(UUID sellerId);

    List<Item> findAll();

    Optional<Item> findById (UUID id);

    Item save (Item seller);

    Optional<Item> delete (Item item);

    Optional<Item> update (Item item);





}
