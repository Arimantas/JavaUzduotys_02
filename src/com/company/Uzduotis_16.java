package com.company;

import java.util.Scanner;

public class Uzduotis_16 {
    // Patikrinti ar paduotame zodyje yra raidziu deriniu "ab"
    // Pries atliekant veiksmus patikrinti ar paduotas zodis yra tinkamas, jei ne grazinti 0
    // HINT: tikrinti ar a nera paskutine zodzio raide, jei ne, tikrinti ar i + 1 yra b

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi: ");
        String zodis = sc.nextLine();

        try {
            int skaicius = Integer.parseInt(zodis);
        } catch (NumberFormatException nfe) {
            System.out.println("Ivedete ne skaiciu");
            System.out.println("Ivestame zodyje yra [" + kiekAB(zodis) + "] raidziu 'ab' deriniai.");
            return;
        }
        System.out.println("Ivedete ne zodi");
        System.out.println("0");
    }

    public static int kiekAB(String zodis) {
        int abSk = 0;

        // tikrinti ar zodis.charAt(zodis.lenght - 1) yra a, jei a tikrinti ar i
        for (int i = zodis.length() - 1; i >= 0; i--) {
            if (zodis.charAt(i) == 'a' && zodis.charAt(i + 1) == 'b') {
                abSk++;
            }
        }
        return abSk;
    }
}