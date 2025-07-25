import java.util.*;
import Lib.*;
import Lib.Animals.*;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Lion"));
        animals.add(new Eagle("Eagle"));
        animals.add(new Penguin("Penguin"));
        animals.add(new Dolphin("Dolphin"));

        for (Animal animal : animals ) {
            System.out.print(animal.getName());
            System.out.println(animal.makeSound());
        }

        for (Animal animal : animals ) {
            if (animal instanceof Flyable) {
                System.out.println(((Flyable)animal).fly());
            }else if (animal instanceof Swimable ) {
                System.out.println(((Swimable)animal).swim());
            }
        }
    }
}
