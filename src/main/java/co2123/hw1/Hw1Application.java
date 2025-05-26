package co2123.hw1;

import co2123.hw1.domain.Product;
import co2123.hw1.domain.Shop;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw1Application implements CommandLineRunner {

    public static List<Shop> shops;

    public static void main(String[] args) {
        SpringApplication.run(Hw1Application.class, args);
    }

    @Override
    public void run(String... args){
        shops = new ArrayList<>();

        Shop shop1 = new Shop();
        shop1.setId(1);
        shop1.setCity("Leicester");
        shop1.setFounder("Sushant Jasra");

        List<Product> products = new ArrayList<>();

        Product product1 = new Product();
        product1.setPackaging("Leather bag");
        product1.setSupplier("Nandos");
        product1.setWares("Clothes");
        product1.setPrice(10000);
        products.add(product1);

        Product product2 = new Product();
        product2.setPackaging("Leather bag");
        product2.setSupplier("Farms");
        product2.setWares("Beans");
        product2.setPrice(400);
        products.add(product2);

        shop1.setProducts(products);
        shops.add(shop1);

        Shop shop2 = new Shop();
        shop2.setId(2);
        shop2.setCity("Leicester");
        shop2.setFounder("Sushant Jasra");
        shops.add(shop2);
    }
}
