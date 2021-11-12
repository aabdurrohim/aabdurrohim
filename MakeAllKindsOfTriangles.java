package cobacoba;

import java.util.Scanner;

public class MembuatSegitiga {
    public static void main(String[] args) {
        int x = 6;
        //right triangle//
        System.out.println("--------");
        for (int i = 1; i <= x ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("--------");
        //inverted right triangle//
        for (int i = 1; i <= 6 ; i++) {
            for (int j = x; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //make a triangle with odd value distance//
        System.out.println("---------");
        for (int i = 1; i <= x ; i++) {
            for (int j = 1; j <= i * 2 - 1  ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("-------");
        // make a triangle with an inverted odd value distance//
        for (int i = 1; i <= x; i++) {
            for (int j = x * 2 - 1; j >= i * 2 - 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //make a right triangle even value//
        System.out.println("-------");
        for (int i = 0; i <= x ; i++) {
            for (int j = 1; j <= i * 2 ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("---------");
        //make a triangle facing left//
        for (int i = 0; i <= x; i++) {
            for (int j = x; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int y = 1; y <= i ; y++) {
                    System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("---------");
        //make a triangle facing left upside down//
        for (int i = 1; i <= x ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int y = x; y >= i; y--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("---------");
        //make a square//
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= 6 ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("--------");
        //make a pyramid///
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai seberapa tinggi : ");
        int baris = input.nextInt();
        for (int i = 1; i <= baris ; i++) {
            for (int j = baris; j >= i ; j--) { 
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //make an inverted pyramid//
        System.out.println("--------");
        System.out.println("masukkan nilai seberapa tinggi : ");
        int nilai = input.nextInt();
        //membuat spasi//
        for (int i = 1; i <= nilai ; i++) { //loop untuk membuat ///
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            //membuat isi dari kiri ke tengah//
            for (int j = nilai; j >= i ; j--) {
                System.out.print("*");
            }
            //membuat isi dari tengah kekiri//
            for (int j = nilai; j <= nilai ; j++) {
                for (int k = nilai; k >= i; k--) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}


