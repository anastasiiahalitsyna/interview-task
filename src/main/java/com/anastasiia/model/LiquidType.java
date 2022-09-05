package com.anastasiia.model;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public enum LiquidType {
    TEA {
        @Override
        public List<Class<? extends LiquidConsumer>> getCompatibleConsumers() {
            return Collections.singletonList(Man.class);
        }
    }, COFFEE {
        @Override
        public List<Class<? extends LiquidConsumer>> getCompatibleConsumers() {
            return Collections.singletonList(Man.class);
        }
    }, MILK {
        @Override
        public List<Class<? extends LiquidConsumer>> getCompatibleConsumers() {
            return Collections.singletonList(Man.class);
        }
    }, WATER {
        @Override
        public List<Class<? extends LiquidConsumer>> getCompatibleConsumers() {
            return Collections.singletonList(Man.class);
        }
    };

    public abstract List<Class<? extends LiquidConsumer>> getCompatibleConsumers();

    public Predicate<Class<? extends LiquidConsumer>> consumable() {
        return clazz -> this.getCompatibleConsumers().contains(clazz);
    }
}
