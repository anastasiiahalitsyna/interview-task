package com.anastasiia.model;

public class Bottle extends LiquidContainer {

    private double price;
    private BottleMaterial bottleMaterial;

    public Bottle(LiquidType liquidType, double containerCapacity, double price, BottleMaterial bottleMaterial) {
        super(liquidType, containerCapacity);
        this.price = price;
        this.bottleMaterial = bottleMaterial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BottleMaterial getBottleMaterial() {
        return bottleMaterial;
    }

    public void setBottleMaterial(BottleMaterial bottleMaterial) {
        this.bottleMaterial = bottleMaterial;
    }

    public enum BottleMaterial {
        PLASTIC, GLASS
    }

    @Override
    public String toString() {
        return String.format("Price: %f\nBottle material: %s\nContainer Capacity: %.2fL\n",
                this.price, this.bottleMaterial, this.getContainerCapacity());
    }
}
