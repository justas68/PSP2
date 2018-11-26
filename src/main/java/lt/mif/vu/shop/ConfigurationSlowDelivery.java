package lt.mif.vu.shop;

import lt.mif.vu.shop.Integrational.mailListener.MailListener;
import lt.mif.vu.shop.Integrational.mailSencer.MessageSender;
import lt.mif.vu.shop.Integrational.mailSenderImp.MessageSenderConsole;
import lt.mif.vu.shop.domainService.shopServiceImp.ShopServiceLimited;
import lt.mif.vu.shop.facadeService.itemService.ItemService;
import lt.mif.vu.shop.facadeService.ItemServiceImp.ItemServiceSlowDelivery;
import lt.mif.vu.shop.facadeService.sellerService.SellerService;
import lt.mif.vu.shop.domainService.shopService.ShopService;
import lt.mif.vu.shop.domainService.shopServiceImp.ShopServiceNormal;
import lt.mif.vu.shop.domainService.buyerFactory.BuyerFactory;
import lt.mif.vu.shop.domainService.buyerFactory.VipBuyerFactory;
import lt.mif.vu.shop.domainService.itemFactory.ItemFactory;
import lt.mif.vu.shop.domainService.itemFactory.SingleItemFactory;
import lt.mif.vu.shop.domainService.sellerFactory.PrivateSellerFactory;
import lt.mif.vu.shop.domainService.sellerFactory.SellerFactory;
import lt.mif.vu.shop.facadeService.sellerServiceImp.SellerServiceImp;
import lt.mif.vu.shop.repository.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration

public class ConfigurationSlowDelivery {

    @Bean
    public ItemService itemService() {
        return new ItemServiceSlowDelivery();
    }

    @Bean
    public SellerService sellerService() {
        return new SellerServiceImp();
    }

    @Bean
    ItemFactory itemFactory() {
        return new SingleItemFactory();
    }

    @Bean
    SellerFactory sellerFactory() {
        return new PrivateSellerFactory();
    }

    @Bean
    BuyerFactory buyerFactory() {
        return new VipBuyerFactory();
    }

    @Bean
    ItemRepository itemRepository() {
        return new ItemRepositoryMemory();
    }

    @Bean
    SellerRepository sellerRepository() {
        return new SellerRepositoryMemory();
    }

    @Bean
    BuyerRepository buyerRepository() {
        return new BuyerRepositoryMemory();
    }
    @Bean
    MessageSender messageSender(){
        return new MessageSenderConsole();
    }

    @Bean
    ShopService shopService1(){
        return new ShopServiceNormal();
    }

    @Bean
    ShopService shopService2(){
        return new ShopServiceLimited();
    }

    @Bean
    List<MailListener> mailListeners() {
        List<MailListener> listeners = new ArrayList<>();
        listeners.add(new ItemRepositoryMemory());
        return listeners;
    }
}