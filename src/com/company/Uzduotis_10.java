package com.company;

import java.util.Scanner;

public class Uzduotis_10 {

    // Paprasyti vartotojo ivesti skaiciu n
    // Suskaiciuoti visu skaiciu nuo 1 iki n suma
    // Jei ivestas n < 1, informauoti apie bloga ivedima
    // BONUS: padaryti su rekursija

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("Iveskite skaiciu n: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Ivedamas n negali buti mazesnis uz 1");
            } else {
                break;
            }
        }
        suma(n);
    }

    public static void suma(int n) {
        int pradinis = n;
        int suma = 0;
        while (n >= 1) {
            suma = suma + n;
            n--;
        }

        for (int i = pradinis; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + suma);
    }
}
