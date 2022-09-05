package com.anastasiia.service;

import com.anastasiia.model.LiquidConsumer;
import com.anastasiia.model.LiquidContainer;

import java.util.function.Predicate;

public class ConsumptionValidatorImpl implements ConsumptionValidator {

    @Override
    public boolean validate(LiquidConsumer consumer, LiquidContainer container) {
        if (consumer == null || container == null) {
            throw new IllegalArgumentException("Consumer and Container can not be null");
        }
        if (container.getLiquidType() == null) {
            throw new IllegalStateException("Liquid type must be set");
        }

        Predicate<Class<? extends LiquidConsumer>> canNotBeConsumed = container.getLiquidType()
                .consumable()
                .negate();

        if (canNotBeConsumed.test(consumer.getClass())) {
            throw new IllegalStateException(
                    String.format("%s can not be consumed by \n%s", container.getLiquidType(), consumer));
        }

        if (consumer.getConsumerCapacity() <= 0) {
            System.out.printf("Consumer: %s doesn't have enough capacity", consumer);
            return false;
        }

        if (container.getContainerCapacity() <= 0) {
            System.out.printf("Not enough liquid left in the container: %s", container);
            return false;
        }
        return true;
    }
}
