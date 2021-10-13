package com.company.animals;

public class Cat extends Mammal{


    //Attribute
    private String breed;
    private int weight;
    private String sex;

    //Constructor
// super(); or this. always in a constructor


    public Cat(String name, String breed, int weight, String sex){
        setName(name);
        this.breed = breed;
        this.weight = weight;
        this.sex = sex;
    }
    public Cat(){};
    //Methods

    @Override
    public void eat(String food) {
        System.out.println("I am eating: " + food);
    }

    @Override
    public Animal reproduce(Animal mother, Animal father) {
        return null;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
