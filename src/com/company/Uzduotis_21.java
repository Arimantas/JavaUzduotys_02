package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Uzduotis_21 {

    private static final String FAILO_VARDAS = "F:/KCS/Kartojimas/Java/Paskaitos/3 paskaita/src/com/company/mano.txt";

    private FileReader _bylosSkaitytuvas;
    private BufferedReader _atmintiesSkaitytuvas;
    private ArrayList<String> _sarasas;

    public static void main(String[] args) {
        Uzduotis_21 at = new Uzduotis_21();
        at.AtidarykFaila();
        at.SukurkNaujaSarasa();
        at.NuskaitykFailaISarasa();
        at.AtvaizduokSarasa();
        at.UzdarykFaila();
    }

    public void AtidarykFaila() {

        try {
            _bylosSkaitytuvas = new FileReader(FAILO_VARDAS);
            _atmintiesSkaitytuvas = new BufferedReader(_bylosSkaitytuvas);
        } catch (Exception e) {
        }
    }

    public void SukurkNaujaSarasa() {
        _sarasas = new ArrayList<String>();
    }

    public void NuskaitykFailaISarasa() {

        try {
            String eilute = _atmintiesSkaitytuvas.readLine();
            while (eilute != null) {
                _sarasas.add(eilute);
                eilute = _atmintiesSkaitytuvas.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void AtvaizduokSarasa() {
        for (String eilute : _sarasas) {
            if (eilute.contains("labas")) {
                System.out.println("Yra labas");
            } else {
                System.out.println("Nera labas");
            }
        }
    }

    public void UzdarykFaila() {
        try {
            _atmintiesSkaitytuvas.close();
            _bylosSkaitytuvas.close();
        } catch (IOException e) {
        }

    }
}