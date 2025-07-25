package Lib.Animals;
import Lib.*;

public class Penguin extends Bird implements Swimable {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return " : Squawk!";
    }

    @Override
    public String swim() {
        return "The penguin drives gracefully in the water.";
    }
    
}
