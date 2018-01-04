package com.company;

import java.util.Scanner;

public class Uzduotis_11 {
    // Ivesti skaiciu n, tuomet vartotojo paklausti ka skaiciuoti
    // nuo 1 iki n (1 - suma, 2 - sandauga)

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

        System.out.println("Pasirinkite kokius veiksmus su skaiciumi " + n + " norite atlikti");
        while (true){
        System.out.println("1 - suma");
        System.out.println("2 - sandauga");
        int pasirinkimas = sc.nextInt();


            switch (pasirinkimas){
                case 1:
                    suma(n);
                    return;
                case 2:
                    sand(n);
                    return;
            }
        }
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

    public static void sand(int n) {
        int pradinis = n;
        int suma = 1;
        while (n >= 1) {
            suma = suma * n;
            n--;
        }

        for (int i = pradinis; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }
        System.out.print(" = " + suma);
    }
}
