package org.niit;

import org.niit.config.AppConfig;
import org.niit.domain.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
        Product p1 = con.getBean("product1", Product.class);
        System.out.println(p1);
        //p1,p2 is a reference of Product type
        Product p2 = con.getBean("product2", Product.class);
        System.out.println(p2);
    }
}
