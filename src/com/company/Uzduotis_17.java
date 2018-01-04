package com.company;

import java.util.Scanner;

public class Uzduotis_17 {
    // Patikrinti ar duotas zodis yra palindromas (zodis kuri skaitant nuo galo gaunamas tas pats zodis)
    // HINT: pasalinti tarpus ir tuomet keliaujant per puse zodzio ir abieju busiu tikrinti ar sutampa
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi: ");
        String zodis = sc.nextLine();
        zodis = zodis.replaceAll(" ", "");

        try {
            int skaicius = Integer.parseInt(zodis);
        } catch (NumberFormatException nfe) {
            System.out.println("Ivedete zodi");
            polindromas(zodis);
            return;
        }
        System.out.println("Ivedete ne zodi");
        System.out.println("0");
    }

    public static void polindromas(String zodis) {
        int pussIlgio = zodis.length() / 2;
        for (int i = 0; i <= pussIlgio; i++) {
            if (zodis.charAt(i) != zodis.charAt(zodis.length() - 1 - i)) {
                System.out.println("Zodis nera polindromas");
                return;
            } else {
                // tikrinimas, sau, kad matyt
                System.out.println(zodis.charAt(i) + " = " + zodis.charAt(zodis.length() - 1 - i));
            }
        }
        System.out.println("Zodis yra polindromas");
    }
}
