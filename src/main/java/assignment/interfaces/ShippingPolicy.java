package assignment.interfaces;

import assignment.Sale;

public interface ShippingPolicy {
    double getShippingCost(Sale sale);
}
