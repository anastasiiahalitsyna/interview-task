package com.anastasiia.service;

import com.anastasiia.model.LiquidConsumer;
import com.anastasiia.model.LiquidContainer;

public interface LiquidConsumingService {

    void consume(LiquidConsumer consumer, LiquidContainer container);
}
