package com.anastasiia.model;


public class Man extends LiquidConsumer {

    private String name;
    private String surname;
    private int age;


    public Man(String name, String surname, int age, double capacity) {
        super(capacity);
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("Name: %s\nSurname: %s\nAge: %d\nConsumer Capacity: %.2fL\n",
                this.name, this.surname, this.age, this.getConsumerCapacity());
    }
}
