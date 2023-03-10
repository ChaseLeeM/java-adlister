package model;

public class Product {
    private String food;
    private double cost;


    public Product(String food, double cost){
        this.food = food;
        this.cost = cost;
    }

    public String getProduct() {
        return food;
    }

    public void setProduct(String product) {
        this.food = product;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return food;
    }
}
