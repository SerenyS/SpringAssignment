package assignment;

import assignment.classes.fileSale;
import assignment.classes.salesSummaryReport;
import assignment.classes.shippingFree;
import assignment.interfaces.SalesInput;
import assignment.interfaces.SalesReport;
import assignment.interfaces.ShippingPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("assignment")
public class AppConfig {

    @Bean
    SalesInput salesInput() {
        //return new consoleSale();
        return  new fileSale("sales.txt");

    }

    @Bean
    SalesReport salesReport() {
        //return new salesSummaryReport();
        return new salesSummaryReport();

    }

    @Bean
    ShippingPolicy shippingPolicy() {
        return new shippingFree();
        // change to update shipping class
        //shippingMinimum or shippingDomestic

    }
}
