package ecommerce;

import ecommerce.model.Product;
import ecommerce.search.LinearSearch;
import ecommerce.search.BinarySearch;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Mobile", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "T-shirt", "Clothing"),
            new Product(4, "Laptop", "Electronics")
        };

        System.out.println("Linear Search: " + LinearSearch.find(products, "Shoes"));
        System.out.println("Binary Search: " + BinarySearch.find(products, "Laptop"));
    }
}
