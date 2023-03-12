package homework2.impl;

import homework2.parents.Animal;
import homework2.parents.Illable;
import homework2.parents.Swimable;

public class Fish extends Animal implements Illable, Swimable {
    public Fish(String name, String color) {
        super(name, color);
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void getIll() {
        System.out.printf("%s got ill.\n", getName());
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }
}
