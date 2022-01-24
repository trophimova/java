
/**
 * Java 1. Homework 5
 * 
 * @author Anna Trofimova
 * @version 25.1.2022
 */

class Lesson5 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "black", 3);
        System.out.println(cat.voice());
        System.out.println(cat);
        Cat cat1 = new Cat("Mursik", "white", 5);
        System.out.println(cat1.voice());
        System.out.println(cat1);
    }
}

class Cat {
    String name;
    String color;
    int age;

    Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    String voice() {
        return "meow";
    }

    @Override
    public String toString() {
        return "Cat: " + name + ", " + color + ", " + age;
    }
}