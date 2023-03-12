package homework2.impl;

import homework2.parents.*;

public class Seagull extends Animal implements Illable, Flyable, Swimable, Speakable {
    public Seagull(String name, String color) {
        super(name, color, 2);
    }

    public Seagull(String name) {
        super(name);
    }

    @Override
    public int getFlightSpeed() {
        return 110;
    }

    @Override
    public void getIll() {
        System.out.printf("%s got ill.\n", getName());
    }

    @Override
    public int getSwimSpeed() {
        return 1;
    }

    @Override
    public void speak() {
        System.out.println("Carr");
    }
}
