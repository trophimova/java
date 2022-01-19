/**
 * Java 1. Homework 3
 * 
 * @author Anna Trofimova
 * @version 19.1.2022
 */

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.println(Arrays.toString((setLenAndValue(5, 2))));
    }

    static void invertArray() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==0) {
                arr[i] = 1;
            } else {
                    arr[i] = 0;
                }   
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillArray() {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void changeArray() {
        int [] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] = arr[i] * 2; 
            } 
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void fillDiagonal() {
        int [][] arr = new int[4][4];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if( i==j ) {
                    arr [i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    static int[] setLenAndValue(int len, int initialValue) {
        int arr[] = new int[len];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

}
