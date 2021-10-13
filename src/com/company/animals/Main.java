package com.company.animals;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("Tidles");
        System.out.println(cat.getName());

        cat.breath();
        cat.poop();
    }
}
