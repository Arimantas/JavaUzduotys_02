package com.company;

import java.util.Scanner;

public class Uzduotis_05 {

    // Ivesti 5 skaicius
    // Baigus ivedineti skaicius turi buti atvaizduoti visi ivesti skaiciai ir ju suma

    public static void main(String[] args) {
        System.out.println("Iveskite 5 skaicius");
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int[] skaiciai = new int[5];
        int sk = 0;

        for (int i = 0; i < 5; i++){
            sk = sc.nextInt();
            skaiciai[i] = sk;
            suma = sk + suma;
        }
        System.out.print("Ivesti skaiciai yra: ");
        for (int j = 0; j < skaiciai.length; j++){
            System.out.print("[" + skaiciai[j] + "] ");
        }
        System.out.println();
        System.out.println("Ivestu skaiciu suma: " + suma);
    }
}
