package com.company;

import java.util.Scanner;

public class Uzduotis_14 {

    // Parasyti metoda kuris paimtu masyva, ir grazintu apsukta ta pati masyva
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

        System.out.println("Paduotas masyvas:");
        for (int reiksme : mas
                ) {
            System.out.print("[" + reiksme + "] ");
        }
        System.out.println();
        int[] mas2 = masApsukimas(mas);
        System.out.println("Apsuktas masyvas:");
        for (int reiksme : mas2
                ) {
            System.out.print("[" + reiksme + "] ");
        }
    }

    // paskutine masyvo reiksme yra mas[mas.length], sita reiksme turi buti mas2[0]

    private static int[] masApsukimas(int[] mas) {
        int[] mas2 = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            mas2[i] = mas[mas.length - 1 - i]; // mas.length gaunas 1 daugiau nei paskutine masyvo vieta, pirmas i atima 0
        }
        return mas2;
    }
}
