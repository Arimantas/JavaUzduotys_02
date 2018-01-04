package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Uzduotis_20 {

    private static final String FAILO_VARDAS = "F:/KCS/Kartojimas/Java/Paskaitos/3 paskaita/src/com/company/skaiciai.txt";

    private FileReader _bylosSkaitytuvas;
    private BufferedReader _atmintiesSkaitytuvas;

    private static int _eilSk;
    private static int[] _mas;

    public static void main(String[] args) {
        Uzduotis_20 at = new Uzduotis_20();
        at.AtidarykFaila();
        at.SukurtiMasyva();
        at.UzdarykFaila();
        at.AtidarykFaila();
        at.NuskaitytiFailaIMasyva();
        at.AtvaizduotiMasyva();
        at.UzdarykFaila();

    }

    public void AtidarykFaila() {

        try {
            _bylosSkaitytuvas = new FileReader(FAILO_VARDAS);
            _atmintiesSkaitytuvas = new BufferedReader(_bylosSkaitytuvas);
        } catch (Exception e) {
        }
    }

    public void SukurtiMasyva() {
        _eilSk = 0;
        try {
            String eilute = _atmintiesSkaitytuvas.readLine();
            while (eilute != null) {
                eilute = _atmintiesSkaitytuvas.readLine();
                _eilSk++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        _mas = new int[_eilSk];
    }

    public void NuskaitytiFailaIMasyva() {
        try {
            for (int i = 0; i < _mas.length; i++) {
                _mas[i] = _atmintiesSkaitytuvas.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void AtvaizduotiMasyva() {
        Arrays.sort(_mas);
        for (int skaicius : _mas) {
            System.out.println(skaicius);
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