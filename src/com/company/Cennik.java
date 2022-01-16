package com.company;

import java.util.HashMap;
import java.util.Hashtable;

public class Cennik {
//    private HashMap<Utwór,Double> cennik = new HashMap<Utwór, Double>();
    private Hashtable<String,Double> cennik = new Hashtable<String,Double>();
    private Bibloteka bibloteka;

    public Cennik(Bibloteka bibloteka){
        this.bibloteka = bibloteka;
        for (Utwór u: bibloteka.utwory) {
            cennik.put(u.getTytuł(),u.getCena());
        }
    }

    public void zmienCenęUtworu(Utwór utwór, Double nowaCena){
        for (Utwór u: bibloteka.utwory) {
            if(cennik.get(u.getTytuł()) == utwór.getCena()) {
                cennik.put(u.getTytuł(), nowaCena);
                notifyAllObservers(u, nowaCena);
            }
        }
    }
    public void notifyAllObservers(Utwór utwór, Double nowaCena){
            utwór.update2(nowaCena);
    }
}
