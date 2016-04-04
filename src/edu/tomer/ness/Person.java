package edu.tomer.ness;

import java.io.Serializable;

/**
 * Created by Dev on 04/04/2016.
 */
public class Person implements Comparable<Person>{
    String firstName;
    String lastName;
    String ID;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    public Person(String firstName, String lastName, String ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    @Override
    public int compareTo(Person o) {
        int nameDistance = firstName.compareTo(o.firstName);
        int lastNameDistance = lastName.compareTo(o.lastName);


        return nameDistance == 0 ? lastNameDistance : nameDistance;
    }
}
