import java.util.*;
import Lib.*;

public class Zoo {
    public static void main(String[] args) {
        List<Animal>animals = new ArrayList();
        animals.add(new Lion("Lion"));
        animals.add(new Eagle("Eagle"));
        animals.add(new Penguin("Penguin"));
        animals.add(new  Dolphin(" Dolphin"));

        for (Animal a : animals ) {
            System.out.print(a.getName());
            System.out.println(a.makeSound());
        }

        for (Animal m : animals) {
            if (m instanceof Flyable) {
                System.out.println(((Flyable)m).fly());
            }
            else if (m instanceof Swimable) {
                System.out.println(((Swimable)m).swim());
            }
            else {
                System.out.println(m.getName()+"Walk");
            }
        }
    }
}
