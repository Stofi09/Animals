package com.company.animals;

public class Cat extends Mammal{


    //Attribute

    //Constructor

    //Methods

    @Override
    public void eat(String food) {
        System.out.println("I am eating: " + food);
    }

    @Override
    public Animal reproduce(Animal mother, Animal father) {
        return null;
    }
}
