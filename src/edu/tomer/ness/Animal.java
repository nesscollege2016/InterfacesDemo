package edu.tomer.ness;


public abstract class Animal {
    private Food food;
    private String name;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "food=" + food +
                ", name='" + name + '\'' +
                '}';
    }

    public Animal(String name, Food food) {
        this.name = name;
        this.food = food;
    }

    public void eat(){
        System.out.println("Eating: " + food);
    }

    public abstract void makeSound();
}
