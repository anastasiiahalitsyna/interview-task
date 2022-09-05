package com.anastasiia.service;

import com.anastasiia.model.LiquidConsumer;
import com.anastasiia.model.LiquidContainer;

public class LiquidConsumingServiceImpl implements LiquidConsumingService {

    private final ConsumptionValidator consumptionValidator;

    public LiquidConsumingServiceImpl(ConsumptionValidator consumptionValidator) {
        this.consumptionValidator = consumptionValidator;
    }

    @Override
    public void consume(LiquidConsumer consumer, LiquidContainer container) {

        if (!consumptionValidator.validate(consumer, container)) {
            return;
        }

        System.out.println("========Before consumption========");
        System.out.printf("====Consumer====\n%s====Container====\n%s", consumer, container);

        final double totalConsumed;

        if (consumer.getConsumerCapacity() <= container.getContainerCapacity()) {
            container.setContainerCapacity(container.getContainerCapacity() - consumer.getConsumerCapacity());
            totalConsumed = consumer.getConsumerCapacity();
            consumer.setConsumerCapacity(0);
        } else {
            consumer.setConsumerCapacity(consumer.getConsumerCapacity() - container.getContainerCapacity());
            totalConsumed = container.getContainerCapacity();
            container.setContainerCapacity(0);
        }

        System.out.println("========After consumption========");
        System.out.printf("====Consumer====\n%s====Container====\n%s", consumer, container);
        System.out.printf("Total consumed: %.2fL %s", totalConsumed, container.getLiquidType());
    }


}
