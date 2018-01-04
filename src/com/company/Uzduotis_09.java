package com.company;

import java.util.Scanner;

public class Uzduotis_09 {
    // Paprasyti vartotojo ivesti 2 skaicius
    // Paprasyti pasirinkti veiksma ka atlikti su skaiciais
    // 1 - suma, 2 - skirtumas, 3 - sandauga
    // Gauta rezultata atvaizduoti ekrane ir paklausti ar testi darba toliau
    // ivedus skaiciu 5 programa turi kartoti darba, priesingu atveju ji nutraukti

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Iveskite 2 skaicius");
            System.out.print("1 skaicius: ");
            float sk1 = sc.nextFloat();
            System.out.print("2 skaicius: ");
            float sk2 = sc.nextFloat();
            System.out.println("Pasirinkite norima atlikti veiksma:");
            System.out.println("1 - suma");
            System.out.println("2 - skirtumas");
            System.out.println("3 - sandauga");
            int pasirinkimas = sc.nextInt();
            // Skaiciuotuvas skaic = new Skaiciuotuvas();
            //Skaiciuotuvas.suma(sk1, sk2);

            switch (pasirinkimas) {
                case 1:
                    System.out.println(sk1 + " + " + sk2 + " = " + Skaiciuotuvas.suma(sk1, sk2));
                    System.out.println("Noredami testi darba iveskite: 5");
                    pasirinkimas = sc.nextInt();
                    if (pasirinkimas == 5){
                        break;
                    } else {
                        return;
                    }
                case 2:
                    System.out.println(sk1 + " - " + sk2 + " = " + Skaiciuotuvas.skirt(sk1, sk2));
                    System.out.println("Noredami testi darba iveskite: 5");
                    pasirinkimas = sc.nextInt();
                    if (pasirinkimas == 5){
                        break;
                    } else {
                        return;
                    }
                case 3:
                    System.out.println(sk1 + " x " + sk2 + " = " + Skaiciuotuvas.sand(sk1, sk2));
                    System.out.println("Noredami testi darba iveskite: 5");
                    pasirinkimas = sc.nextInt();
                    if (pasirinkimas == 5){
                        break;
                    } else {
                        return;
                    }
                case 5:
                    return;
            }

        }
    }
}

class Skaiciuotuvas {

    public static float suma(float sk1, float sk2) {
        return sk1 + sk2;
    }

    public static float skirt(float sk1, float sk2) {
        return sk1 - sk2;
    }

    public static float sand(float sk1, float sk2) {
        return sk1 * sk2;
    }
}
