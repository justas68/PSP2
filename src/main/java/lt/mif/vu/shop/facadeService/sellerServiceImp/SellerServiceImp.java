package lt.mif.vu.shop.facadeService.sellerServiceImp;

import lt.mif.vu.shop.domainService.shopService.ShopService;
import lt.mif.vu.shop.facadeService.sellerService.SellerService;
import lt.mif.vu.shop.repository.SellerRepository;
import lt.mif.vu.shop.domain.seller.Seller;
import lt.mif.vu.shop.domainService.sellerFactory.SellerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class SellerServiceImp implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private SellerFactory sellerFactory;

    @Autowired
    private ShopService shopService2;

    public Seller registerSeller(String name, String country) {
        shopService2.test();
        Seller seller = sellerFactory.getSeller(name, country);
        sellerRepository.save(seller);
        return seller;
    }

    public Seller unregisterSeller(UUID id) {
        Seller seller = sellerRepository.findById(id).orElse(null);
        if (seller != null){
            sellerRepository.delete(seller);
            return seller;
        }
        return null;
    }

    public Seller updateSellerInfo(String name, String country, UUID id) {
        return null;
    }

    public List<Seller> getAllSellers() {
        return sellerRepository.getAll();
    }

    public Seller getSellerById(UUID id) {
        return sellerRepository.findById(id).orElse(null);
    }
}
