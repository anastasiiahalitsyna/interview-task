package com.anastasiia.model;

public class LiquidConsumer {

    private double consumerCapacity;

    public LiquidConsumer(double consumerCapacity) {
        this.consumerCapacity = consumerCapacity;
    }

    public double getConsumerCapacity() {
        return consumerCapacity;
    }

    public void setConsumerCapacity(double consumerCapacity) {
        this.consumerCapacity = consumerCapacity;
    }

    @Override
    public String toString() {
        return "LiquidConsumer{" +
                "consumerCapacity=" + consumerCapacity +
                '}';
    }
}
