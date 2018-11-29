package lt.mif.vu.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ShopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cx =	SpringApplication.run(ShopApplication.class, args);
        //SpringApplication.run(ShopApplication.class, args);

    }
}
