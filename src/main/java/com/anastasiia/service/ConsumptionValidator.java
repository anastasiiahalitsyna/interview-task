package com.anastasiia.service;

import com.anastasiia.model.LiquidConsumer;
import com.anastasiia.model.LiquidContainer;

public interface ConsumptionValidator {
    boolean validate(LiquidConsumer consumer, LiquidContainer container);
}
