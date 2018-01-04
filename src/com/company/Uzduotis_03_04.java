package com.company;

import java.util.Scanner;

public class Uzduotis_03_04 {

    // Paprasyti vartotojo vesti skaicius, tok kol nebus ivestas skaicius 0
    // atvaizduoti pries tai ivestu skaiciu suma

    // Neleisti vartotojui ivesti ne skaiciu, prasyti ivesti skaicius

    public static void main(String[] args) {
        System.out.println("Iveskite bet koki skaiciu: ");
        Scanner sc = new Scanner(System.in);
        int sk = 1;
        int suma = 0;

        while (sk != 0) {
            try {
                sk = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Prasiau ivesti skaiciu");
                sc.nextLine();
            }
            suma = suma + sk;
        }
        System.out.println("Pries tai ivestu skaiciu suma yra lygi: " + suma);
    }
}

