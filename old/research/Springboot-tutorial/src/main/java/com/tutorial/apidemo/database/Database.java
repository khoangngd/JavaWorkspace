package com.tutorial.apidemo.database;

import com.tutorial.apidemo.models.Product;
import com.tutorial.apidemo.repositories.ProductRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class Database {
    //logger
    private static  final Logger logger= (Logger) LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){

        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productA = new Product( "Macbook", 2020, 2400.0, "");
                Product productB = new Product( "Iphone", 2020, 1400.0, "");
//                System.out.println("insert data: " + productRepository.save(productA));
//                System.out.println("insert data: " + productRepository.save(productB));
                logger.info("insert data: " + productRepository.save(productA));
                logger.info("insert data: " + productRepository.save(productB));
            }
        };
    }
}
