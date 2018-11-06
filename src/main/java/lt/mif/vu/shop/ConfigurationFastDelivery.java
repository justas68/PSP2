package lt.mif.vu.shop;

import lt.mif.vu.shop.repository.*;
import lt.mif.vu.shop.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
public class ConfigurationFastDelivery {

    @Bean
    public ItemService itemService() {
        return new ItemServiceFastDelivery();
    }

}
