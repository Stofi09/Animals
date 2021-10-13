package com.company.animals;

public class Cat extends Mammal{


    //Attribute
    private String breed;
    private int weight;
    private String sex;

    //Constructor

    public Cat(String name, String breed, int weight, String sex){
        setName(name);
        this.breed = breed;
        this.weight = weight;
        this.sex = sex;
    }

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
