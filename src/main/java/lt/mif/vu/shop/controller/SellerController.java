package lt.mif.vu.shop.controller;

import lt.mif.vu.shop.domain.seller.Seller;
import lt.mif.vu.shop.facadeService.sellerService.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping("sellers/getAll")
    public List<Seller> getAll() {
        return sellerService.getAllSellers();
    }

    @GetMapping("/getSeller/{id}")
    public Seller getSellerById (@PathVariable UUID id) {
        return sellerService.getSellerById(id);
    }

    @PostMapping("/addSeller")
    public Seller addSeller(@RequestParam("name") String name, @RequestParam("country") String country) {
        return sellerService.registerSeller(name, country);
    }

    @DeleteMapping("/removeSeller/{id}")
    public Seller deleteSeller (@PathVariable UUID id) {
        return sellerService.unregisterSeller(id);
    }

    @PutMapping("/updateSeller/{id}")
    public Seller updateSeller (@PathVariable UUID id, @RequestParam("name") String name, @RequestParam("country") String country){
        return sellerService.updateSellerInfo(name, country, id);
    }
}
