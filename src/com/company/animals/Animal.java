package com.company.animals;

import java.time.LocalDate;

public abstract class Animal {

    //Attributes
    private String name;
    private LocalDate dateOfBirth;

    //Constructors


    //Methods

    public abstract void eat(String food);

    public void sleep(int time){
        System.out.println("Sleep for " + time + " hours");
    };

    public abstract void breath();

    public void poop(){
        System.out.println("Pooping!");
    }

    public abstract Animal reproduce(Animal mother, Animal father);

    public void death(){
        System.out.println("Its dead");
    };
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
