package com.company;

import java.util.Scanner;

public class Uzduotis_02 {

    // Ivesti betkoki zodi ir ji atvaizduoti ekrane
    // Prasyti ivedineti zodzius kol neivedamas: "pabaiga"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Iveskite zodi: ");
            String zodis = sc.nextLine();
            if (zodis.equals("pabaiga")) {
                System.out.println("Programos pabaiga.");
                return;
            } else {
                System.out.println("Jusu ivestas zodis yra: " + zodis);
                System.out.println("Noredami nutraukti programos darba parasykite - pabaiga");
            }
        }
    }
}

