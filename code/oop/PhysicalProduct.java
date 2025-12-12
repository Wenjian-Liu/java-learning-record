package com.itheima.chap03;

public class PhysicalProduct extends Product {
    private double weight;

    public PhysicalProduct(String name, double price, double weight){
        super(name, price);
        this.weight = weight;
    }

    public String displayInfo() {
        return super.displayInfo() + "，重量" + weight + "g";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
