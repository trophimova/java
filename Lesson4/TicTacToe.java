/**
 * Java 1. Homework 4
 * 
 * @author Anna Trofimova
 * @version 23.1.2022
 */

import java.util.Random;
import java.util.Scanner;

class TicTacToe {

    final char CHAR_O = 'o';
    final char CHAR_X = 'x';
    final char CHAR_DOT = '.';
    Random random;
    Scanner scanner;
    char[][] table;

    public static void main(String[] args) {
        new TicTacToe().game();;
    }

    TicTacToe() {
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    void game() {
        initTable();
        printTable();
        while(true) {
            turnHuman();
            if(checkWin(CHAR_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if(isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
            turnAI();
            printTable();
            if(checkWin(CHAR_O)) {
                System.out.println("AI WON!");
                break;
            }
            if(isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
        }
        System.out.println("GAME OVER");
        printTable();
    }

    void initTable() {
        for(int x=0; x < 3; x++) {
            for(int y = 0; y < 3; y++) {
                table[x][y] = CHAR_DOT;
            }
        }
    }

    void printTable() {
        for(int y=0; y < 3; y++) {
            for(int x = 0; x < 3; x++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter x y [1..3]: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while(!isCellValid(x, y));
        table[x][y] = CHAR_X;    
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while(!isCellValid(x, y));
        table[x][y] = CHAR_O;
    }

    boolean isCellValid(int x, int y) {
        if(x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == CHAR_DOT;
    }

    boolean checkWin(char ch) {
        // int count = 0;
        // for(int x = 0; x < 2; x++) {
        //     for(int y = 0; y < 2; y++) {
        //         if((table[x][y] == ch) || (table[y][x] == ch)) {
        //             count++;
        //             if(count >= 3) {
        //                 return true;
        //             }
        //         } else count = 0;
        //     }
        //     count = 0;
        //     return false;
        // }
        

        //
        if(table[0][0] == ch && table[0][1] == ch && table[0][2] == ch) return true;
        if(table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
        if(table[2][0] == ch && table[2][1] == ch && table[2][2] == ch) return true;
        //
        if(table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
        if(table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
        if(table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) return true;
        
        if((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) || (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch)) return true;
        return false;
    }

    boolean isTableFull() {
        for(int x=0; x < 3; x++) {
            for(int y = 0; y < 3; y++) {
                if (table[x][y] == CHAR_DOT) {
                   return false; 
                }
            }
        }
        return true;
    }

}