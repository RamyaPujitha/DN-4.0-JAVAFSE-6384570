package ecommerce.search;

import ecommerce.model.Product;

public class LinearSearch {
    public static Product find(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }
}
