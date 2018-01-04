package com.company;

import java.util.Scanner;

public class Uzduotis_06 {

    // Paprasyti ivesti 5 zodzius
    // Juo atvaizduoti po ivedimo

    public static void main(String[] args) {
        System.out.println("Iveskite 5 zodzius");
        Scanner sc = new Scanner(System.in);
        String[] zodziai = new String[5];

        for (int i = 0; i < 5; i++){
            String zodis = sc.nextLine();
            zodziai[i] = zodis;
        }

        System.out.print("Ivesti zodziai yra: ");
        for (int j = 0; j < zodziai.length; j++){
            System.out.print("[" + zodziai[j] + "] ");
        }
    }
}
