package org.niit.config;

import org.niit.domain.Product;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("product1")
    public Product getProduct1() {
        return new Product("Product1", "#isbn1", "200$", "Red","DIY product");
    }
    @Bean("product2")
    public Product getProduct2(){
        return  new Product("Product2","#isbn2","300$","Black","Pre-Assembled");
    }
}
