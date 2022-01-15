/**
 * Java 1. Homework 2
 * 
 * @author Anna Trofimova
 * @version 15.1.2022
 */

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(within10and20(5, 5));
        System.out.println(isPositiveOrNegative(-8)); 
        System.out.println(isNegative(0));  
        printWordNTimes("hello", 5);    
    }

    static boolean within10and20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;      
    }

    static String isPositiveOrNegative(int x) {
        return (x >= 0 ? "Число положительное" : "Число отрицательное");
    }

    static boolean isNegative(int a) {
        return a < 0;
    }

    static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        } 
    }
}