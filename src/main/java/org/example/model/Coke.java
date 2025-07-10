package org.example.model;

public class Coke extends ProductForSale{
    @Override
    public void showDetails() {
        System.out.println("Price:" + getPrice());
    }

    String name;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }
}
