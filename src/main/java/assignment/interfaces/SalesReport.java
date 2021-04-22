package assignment.interfaces;

import assignment.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
