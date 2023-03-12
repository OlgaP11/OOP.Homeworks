package homework2.impl;

import homework2.parents.*;

public class Duck extends Animal implements Illable, Flyable, Swimable, Speakable {
    public Duck(String name, String color) {
        super(name, color, 2);
    }

    public Duck(String name) {
        super(name);
    }

    @Override
    public void getIll() {
        System.out.printf("%s got ill.\n", getName());
    }

    @Override
    public int getFlightSpeed() {
        return 105;
    }

    @Override
    public int getSwimSpeed() {
        return 1;
    }

    @Override
    public void speak() {
        System.out.println("Krya");
    }
}
