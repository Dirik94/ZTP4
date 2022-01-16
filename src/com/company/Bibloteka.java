package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Bibloteka extends Observer {
    ArrayList<Utwór> utwory = new ArrayList<Utwór>();
    HashMap<Utwór,Integer> sumaOdtworzeń= new HashMap<Utwór,Integer>();
    Double sumaZamówienia = 0.0;


    public void dodajUtwór(Utwór u){
        utwory.add(u);
    }

    public void usuńjUtwór(Utwór u){
        utwory.remove(u);
    }

    public Utwór pobierzUtwór(Integer numerZListy){
        return utwory.get(numerZListy);
    }
    int i = 0;
    @Override
    public void update(Integer numer) {
//        System.out.println( "Utwór zakutalizowany: " + utwór.getTytuł() + " " + utwór.getWykonawca());
//        sumaOdtworzeń.put(pobierzUtwór(numer), i++);\
        sumaZamówienia += pobierzUtwór(numer).getCena();
        pobierzUtwór(numer).setSumaOdtworzeń(pobierzUtwór(numer).getSumaOdtworzeń() + 1);
        System.out.println("Teraz gra: " + pobierzUtwór(numer).getTytuł() + " " + pobierzUtwór(numer).getWykonawca() + "-" + pobierzUtwór(numer).getCzasTrwania());
    }

    public void ileRazyBiblotekaGra(){
        for (Utwór u: utwory) {
            System.out.println(u.getTytuł() +": suma odtworzeń: " + u.getSumaOdtworzeń());
        }
        System.out.println("Koszt odtworzeń: "+ sumaZamówienia);
    }

    public Bibloteka getBibloteka(){
        return this;
    }

}
