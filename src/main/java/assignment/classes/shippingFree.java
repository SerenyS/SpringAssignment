package assignment.classes;

import assignment.Sale;
import assignment.interfaces.ShippingPolicy;

public class shippingFree implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {
        return 0;
    }
}
