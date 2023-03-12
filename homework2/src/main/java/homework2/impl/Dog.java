package homework2.impl;

import homework2.parents.*;
import homework2.parents.Runnable;

public class Dog extends Animal implements Illable, Swimable, Runnable, Speakable {
    public Dog(String name, String color) {
        super(name, color, 4);
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }

    @Override
    public void getIll() {
        System.out.printf("%s got ill.\n", getName());
    }


    @Override
    public void speak() {
        System.out.println("Woof");
    }

    @Override
    public int getRunSpeed() {
        return 15;
    }
}
