package lt.mif.vu.shop.controller;

import lt.mif.vu.shop.model.Item;
import lt.mif.vu.shop.service.ItemService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/createItem")
    public Item addItem(@RequestBody Item item) {
        return itemService.addNewItem(item.getPrice(), item.getName(), item.getDescription());
    }

    @DeleteMapping("/deleteItem/{id}")
    public Item deleteItem (@PathVariable UUID id) {
        Item item = itemService.findItem(id);
        if (id != null){
            itemService.sellItem(item);
        }
        return item;
    }

    @PutMapping("/updateItem/{id}")
    public Item updateItem (@PathVariable UUID id, @RequestBody Item item){
        return itemService.updateItem(id, item);
    }
}
