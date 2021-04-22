package assignment.classes;

import assignment.Sale;
import assignment.interfaces.ShippingPolicy;

public class shippingDomestic implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {
        if (sale.getCountry().equals("United States")) {
            return 10.0;
        } else {
            return 20.0;
        }
    }
}