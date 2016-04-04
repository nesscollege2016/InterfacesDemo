package edu.tomer.ness;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Timer;

public class Main{

    public static void main(String[] args) {
        Timer timer = new Timer();

        MyTimerTask task = new MyTimerTask();

        timer.scheduleAtFixedRate(task, 0, 1000 * 1);


    }


    static void sortWithCollections(){
        Person p = new Person("Moshe", "Cohen", "50505");
        Person p1 = new Person("David", "Cohen", "564665");
        Person p2 = new Person("Avraham", "Cohen", "68476848");
        Person p3 = new Person("Jakob", "Cohen", "684684");


        ArrayList<Person> people = new ArrayList<>();

        people.add(p);
        people.add(p1);
        people.add(p2);
        people.add(p3);

        Collections.sort(people);

        Collections.shuffle(people);

        System.out.println(people);
    }
    private static void mySort(ArrayList<Person> people ) {
        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size() - 1; j++) {
                String f1 = people.get(j).firstName;
                String f2 = people.get(j+1).firstName;
                int dist = f1.compareTo(f2);
                if (dist > 0){
                    Person pj1 = people.get(j + 1);
                    Person pj = people.get(j);
                    people.set(j, pj1);
                    people.set(j+1, pj);
                }
            }
        }

        System.out.println(people);
    }


}
