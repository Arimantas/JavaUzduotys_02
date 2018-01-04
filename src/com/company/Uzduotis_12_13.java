package com.company;

import java.util.Scanner;

public class Uzduotis_12_13 {

    // Parasyti metoda kurio parametras butu sveikuju skaiciu masyvas,
    // metodas turi grazinti didziausia masyvo skaiciu

    // Parasyti metoda kurio parametras butu sveikuju skaiciu masyvas,
    // metodas turi grazinti maziausia masyvo skaiciu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu masyvo ilgi: ");
        int masIlg;
        while (true) {
            masIlg = sc.nextInt();
            if (masIlg < 1) {
                System.out.println("Netinkamas masyvo dydis, iveskite skaiciu didesni uz 0");
            } else {
                break;
            }
        }
        int[] mas = new int[masIlg];

        for (int i = 0; i < masIlg; i++) {
            System.out.println("Iveskite " + (i + 1) + " masyvo skaiciu: ");
            mas[i] = sc.nextInt();
        }

        int maxMasSk = maxReiksme(mas);
        System.out.println("Didziausia masyvo reiksme: " + maxMasSk);
        int minMasSk = minReiksme(mas);
        System.out.println("Maziausia masyvo reiksme: " + minMasSk);
    }

    private static int maxReiksme(int[] mas) {
        int maxMas = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > maxMas) {
                maxMas = mas[i];
            }
        }
        return maxMas;
    }

    private static int minReiksme(int[] mas) {
        int minMas = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < minMas) {
                minMas = mas[i];
            }
        }
        return minMas;
    }
}
