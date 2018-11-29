package lt.mif.vu.shop.controller.itemController;

import lt.mif.vu.shop.domain.item.Item;
import lt.mif.vu.shop.facadeService.itemService.ItemService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public String mainPage() {
        return "Main page of this wonderful shop";
    }

    @GetMapping("/getAll")
    public List<Item> getAll() {
        return itemService.findAllItems();
    }

    @GetMapping("/getAll/{search}")
    public List<Item> getAllWithKeyword(@PathVariable String search) {
        return itemService.searchForItem(search);
    }

    @PostMapping("/addItem/{sellerId}")
    public Item addItem(@RequestParam("price") double price, @RequestParam("name") String name, @RequestParam("description") String description, @PathVariable UUID sellerId) {
        return itemService.addNewItem(price, name, description, sellerId);
    }

    @DeleteMapping("/deleteItem/{id}/{sellerId}")
    public void deleteItem (@PathVariable UUID id, @PathVariable UUID sellerId) {
        itemService.sellItem(id, sellerId);
    }

    @PutMapping("/updateItem/{id}")
    public Item updateItem (@PathVariable UUID id, @RequestParam("price") double price, @RequestParam("name") String name, @RequestParam("description") String description){
        return itemService.updateItem(id, price, name, description);
    }
}
