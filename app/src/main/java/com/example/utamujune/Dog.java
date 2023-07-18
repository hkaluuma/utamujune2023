package com.example.utamujune;

public class Dog {
    int size = 4;
    private String color;
    public String dogSound;
    protected int legs;
    /*
    *sample method*/
    private String makeSound(){
        System.out.println("dog can make sound");
        return color;
    }

    //calculate method
    public Integer calculateSize(){
        int noOfLegs = 5;
        System.out.println("Size is: " + noOfLegs );
        return this.size;
    }

}
