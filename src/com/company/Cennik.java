package com.company;

import java.util.HashMap;
import java.util.Hashtable;

public class Cennik {
//    private HashMap<Utwór,Double> cennik = new HashMap<Utwór, Double>();
    private HashMap<String,Double> cennik = new HashMap<String, Double>();
    private Bibloteka bibloteka;

    public Cennik(Bibloteka bibloteka){
        this.bibloteka = bibloteka;
        for (Utwór u: bibloteka.utwory) {
            cennik.put(u.getTytuł(), 0.0);
        }
    }

    public void zmienCenęUtworu(Utwór utwór, Double nowaCena){
//        for (Utwór u: bibloteka.utwory) {
//            if (u.getTytuł()==utwór.getTytuł())
//                u.setCena(nowaCena);
//        }
        for (Utwór u: bibloteka.utwory) {
            if(u.getTytuł() == cennik.get(u.getTytuł()).toString()) {
                cennik.replace(u.getTytuł(), nowaCena);
                notifyAllObservers(u, nowaCena);
            }
        }
    }
    public void notifyAllObservers(Utwór utwór, Double nowaCena){
            utwór.update2(nowaCena);
    }
}
