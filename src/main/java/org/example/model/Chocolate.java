package org.example.model;

public class Chocolate extends ProductForSale{
    @Override
    public void showDetails() {
        System.out.println("Price:" + getPrice());
    }

    String name;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

}
