package homework2.impl;

import homework2.parents.Animal;
import homework2.parents.Illable;
import homework2.parents.Speakable;
import homework2.parents.Swimable;

public class Dolphin extends Animal implements Illable, Swimable, Speakable {
    public Dolphin(String name, String color) {
        super(name, color);
    }

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void getIll() {
        System.out.printf("%s got ill.\n", getName());
    }

    @Override
    public int getSwimSpeed() {
        return 28;
    }

    @Override
    public void speak() {
        System.out.println("Whistle");
    }
}
