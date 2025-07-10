package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale [] list = {new Chocolate("milky", 25, "milky chocolate" ), new Coke("diet", 45, "diet"), new Bread("white", 30, "wheat")};

        listProducts(list);
    }

    public static void listProducts(ProductForSale[] products) {

        for (int i=0; i<products.length; i++){
            products[i].showDetails();
        }
    }
}