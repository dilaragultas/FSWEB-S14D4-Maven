package org.example.model;

public class Bread extends ProductForSale{
    @Override
    public void showDetails() {
        System.out.println("Price:" + getPrice());
    }

    String name;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }
}
