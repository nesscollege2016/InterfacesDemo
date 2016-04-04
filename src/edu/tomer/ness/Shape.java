package edu.tomer.ness;

/**
 * Created by Dev on 04/04/2016.
 */
public class Shape implements Printable{
    String name;

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
