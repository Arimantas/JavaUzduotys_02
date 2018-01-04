package com.company;

import java.util.Scanner;

public class Uzduotis_07_08 {

    // 1.7 Paprasyti vartotojo ivedti kiek skaiciu jis nori ivesti
    // Po ivedimo atvaizduoti tik tuos skaicius kurie yra didesni uz 100

    // 1.8 Atvaizdavima atlikti kitame metode

    private static int[] masyvas;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Parasykite kiek skaiciu norite ivesti: ");
        int kiek = sc.nextInt();
        masyvas = new int[kiek];
        //int sk = 0;

        for (int i = 0; i < kiek; i++) {
            int sk = sc.nextInt();
            masyvas[i] = sk;
        }
        atvaizdavimas();
    }

    private static void atvaizdavimas() {
        System.out.print("Skaiciai didesni uz 100: ");
        for (int j = 0; j < masyvas.length; j++) {
            if (masyvas[j] > 100) {
                System.out.print("[" + masyvas[j] + "] ");
            }
        }
    }
}