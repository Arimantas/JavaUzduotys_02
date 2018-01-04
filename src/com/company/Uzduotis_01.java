package com.company;

import java.util.Scanner;

public class Uzduotis_01 {
    // Ivesti norima skaiciu
    // Isvesti ar tai lyginis ar nelyginis skaicius

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite bet koki skaiciu: ");
        int skaicius = sc.nextInt();
        if (skaicius % 2 == 0) {
            System.out.println(skaicius + " - LYGINIS");
        } else {
            System.out.println(skaicius + " - NELYGINIS");
        }

    }
}
