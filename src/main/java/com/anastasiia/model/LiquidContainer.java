package com.anastasiia.model;

public class LiquidContainer {

    private LiquidType liquidType;
    private double containerCapacity;

    public LiquidContainer(LiquidType liquidType, double containerCapacity) {
        this.liquidType = liquidType;
        this.containerCapacity = containerCapacity;
    }

    public double getContainerCapacity() {
        return containerCapacity;
    }

    public void setContainerCapacity(double containerCapacity) {
        this.containerCapacity = containerCapacity;
    }

    public LiquidType getLiquidType() {
        return liquidType;
    }

    public void setLiquidType(LiquidType liquidType) {
        this.liquidType = liquidType;
    }

    @Override
    public String toString() {
        return "LiquidContainer{" +
                "beverageType=" + liquidType +
                ", containerCapacity=" + containerCapacity +
                '}';
    }
}
