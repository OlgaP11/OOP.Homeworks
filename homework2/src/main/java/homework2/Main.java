package homework2;

import homework2.impl.*;
import homework2.parents.Flyable;
import homework2.parents.Runnable;
import homework2.parents.Speakable;
import homework2.parents.Swimable;
import homework2.vetClinic.Doctor;
import homework2.vetClinic.VetClinic;


public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Murka"))
                .addAnimal(new Dog("Rex"))
                .addAnimal(new Dolphin("Sara"))
                .addAnimal(new Duck("Donald"))
                .addAnimal(new Fish("Dori"))
                .addAnimal(new Seagull("Jonathan"));

        for(Speakable animal: vetClinic.getSpeakable()){
            animal.speak();
        }

        for (Flyable animal: vetClinic.getFlyable()) {
            System.out.printf("%s has flight speed %d.\n",
                    animal.getClass().getSimpleName(), animal.getFlightSpeed());
        }
        for (Swimable animal: vetClinic.getSwimmable()) {
            System.out.printf("%s has swim speed %d.\n",
                    animal.getClass().getSimpleName(),animal.getSwimSpeed());
        }
        for (Runnable animal: vetClinic.getRunnable()) {
            System.out.printf("%s has run speed %d.\n",
                    animal.getClass().getSimpleName(),animal.getRunSpeed());
        }
        System.out.println();

        Doctor doctor1 = new Doctor("Popov", "Semen");
        doctor1.work();
    }
}
