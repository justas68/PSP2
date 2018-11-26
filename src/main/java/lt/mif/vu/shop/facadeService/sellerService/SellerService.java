package lt.mif.vu.shop.facadeService;

import lt.mif.vu.shop.domain.seller.Seller;

import java.util.List;
import java.util.UUID;

public interface SellerService {

    public Seller registerSeller(String name, String country);

    public Seller unregisterSeller(UUID id);

    public Seller updateSellerInfo(String name, String country, UUID id);

    public List<Seller> getAllSellers();

    public Seller getSellerById(UUID id);
}
