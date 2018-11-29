package lt.mif.vu.shop.controller.buyerController;

import lt.mif.vu.shop.domain.buyer.Buyer;
import lt.mif.vu.shop.facadeService.buyerService.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class BuyerController {
    @Autowired
    private BuyerService buyerService;


    @GetMapping("/buyers/getAll")
    public List<Buyer> getAll() {
        return buyerService.getAllBuyers();
    }

    @PostMapping("/addBuyer")
    public Buyer addBuyer(@RequestParam("fullName") String name) {
        return buyerService.registerBuyer(name);
    }

    @DeleteMapping("/deleteBuyer/{id}")
    public void deleteBuyer (@PathVariable UUID id) {
        buyerService.deleteBuyer(id);
    }

    @PutMapping("/updateBuyer/{id}")
    public Buyer updateBuyer (@PathVariable UUID id, @RequestParam("fullName") String fullName, @RequestParam("wallet") double wallet){
        return buyerService.updateBuyer(id, fullName, wallet);
    }

}
