package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Utwór utwór0 = new Utwór("What a Wonderful World", "Louis Amstrong", 2.29, 5.20);
        Utwór utwór1 = new Utwór("Johnny B Goode", "Chuck Berry", 2.41, 5.20);

        Bibloteka bibloteka = new Bibloteka();
        Bibloteka bibloteka1 = new Bibloteka();

//        utwór0.dodajBilioteke(bibloteka1);
//        bibloteka1.dodajUtwór(utwór0);
//        bibloteka1.dodajUtwór(utwór1);

        utwór0.dodajBilioteke(bibloteka);
        bibloteka.dodajUtwór(utwór0);
        bibloteka.dodajUtwór(utwór1);

        Cennik cennik = new Cennik(bibloteka);
        cennik.zmienCenęUtworu(utwór0, 1.1);

        utwór0.utwórGra(0);
        utwór0.utwórGra(0);
        utwór0.utwórGra(1);
        bibloteka.ileRazyBiblotekaGra();
    }
}
