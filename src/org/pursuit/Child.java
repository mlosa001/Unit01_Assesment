package org.pursuit;

public class Child extends Parent {


    private int age;

    public Child(String eyeColor, String hairColor, int age) {
        super(eyeColor, hairColor);

    }

    public int getAge(int age) {
        return this.age;
    }


}