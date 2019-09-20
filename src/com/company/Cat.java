package com.company;

public class Cat {

    String name;
    int age;

    public void SayMeow(){
        System.out.println("MEOOOOOOW");
    }

    public void Jump(){
        System.out.println("JUMPPPPP");
    }

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "BARSIK";

        barsik.SayMeow();
        barsik.Jump();
    }
}
