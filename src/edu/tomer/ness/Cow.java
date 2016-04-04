package edu.tomer.ness;

/**
 * Created by Dev on 04/04/2016.
 */
public class Cow extends Animal implements Printable{

    public Cow(String name) {
        super(name, Food.GRASS);
    }

    public void giveMilk(){
        System.out.println("Milking...");
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
