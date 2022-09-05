package com.anastasiia.controller;

import com.anastasiia.model.Bottle;
import com.anastasiia.model.LiquidType;
import com.anastasiia.model.Man;
import com.anastasiia.service.ConsumptionValidator;
import com.anastasiia.service.ConsumptionValidatorImpl;
import com.anastasiia.service.LiquidConsumingService;
import com.anastasiia.service.LiquidConsumingServiceImpl;

public class DrinkingController {
    public static void main(String[] args) {
        Bottle bottle = new Bottle(LiquidType.MILK, 1, 25, Bottle.BottleMaterial.GLASS);
        Man man = new Man("James", "Dean", 25, 2);

        ConsumptionValidator consumptionValidator = new ConsumptionValidatorImpl();
        LiquidConsumingService liquidConsumingService = new LiquidConsumingServiceImpl(consumptionValidator);
        liquidConsumingService.consume(man, bottle);
    }
}
