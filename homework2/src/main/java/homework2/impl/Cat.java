package homework2.impl;

import homework2.parents.Runnable;
import homework2.parents.Animal;
import homework2.parents.Illable;
import homework2.parents.Speakable;

public class Cat extends Animal implements Illable, Runnable, Speakable {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void getIll() {
        System.out.printf("%s got ill\n", getName());
    }


    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public int getRunSpeed() {
        return 14;
    }
}
