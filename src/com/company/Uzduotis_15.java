package com.company;

import java.util.Scanner;

public class Uzduotis_15 {

    // Suskaiciuoti kiek paduotame zodyje yra raidziu
    // Pries atliekant veiksmus patikrinti ar paduotas zodis yra skaicius, jei skaicius, grazinti 0
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi: ");
        String zodis = sc.nextLine();

        try {
            int skaicius = Integer.parseInt(zodis);
        } catch (NumberFormatException nfe) {
            System.out.println("Ivedete ne skaiciu");
            System.out.println("Ivestame zodyje yra a raidziu: " + kiekA(zodis));
            return;
        }
        System.out.println("Ivedete ne zodi");
        System.out.println("0");
    }

    public static int kiekA(String zodis){
        int aSk = 0;
        for (int i = 0; i < zodis.length(); i++){
            if (zodis.charAt(i) == 'a'){
                aSk++;
            }
        }
        return aSk;
    }
}

