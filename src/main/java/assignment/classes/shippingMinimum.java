package assignment.classes;

import assignment.Sale;
import assignment.interfaces.ShippingPolicy;

public class shippingMinimum implements ShippingPolicy {

    private double amountForFreeShipping;

    public shippingMinimum(double amountForFreeShipping) {
        this.amountForFreeShipping = amountForFreeShipping;
    }

    @Override
    public double getShippingCost(Sale sale) {
        if (sale.getAmount() >= amountForFreeShipping) {
            return 0.0;
        } else {
            return 10.0;
        }
    }
}