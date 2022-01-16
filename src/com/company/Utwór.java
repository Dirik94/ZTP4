package com.company;

import java.util.*;

public class Utwór{

    private String tytuł;
    private String wykonawca;
    private Double czasTrwania;
    private Integer sumaOdtworzeń;
    private Double cena;
    private List<Bibloteka> biblioteki = new ArrayList<Bibloteka>();

    public Utwór(String tytuł, String wykonawca, Double czasTrwania, Double cena){
        this.tytuł = tytuł;
        this.wykonawca = wykonawca;
        this.czasTrwania = czasTrwania;
        this.cena = cena;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public void setSumaOdtworzeń(Integer suma){
        this.sumaOdtworzeń = suma++;
    }

    public Integer getSumaOdtworzeń(){
        if(sumaOdtworzeń == null)
            sumaOdtworzeń = 0;
        return sumaOdtworzeń;
    }

    public String getTytuł() {
        return tytuł;
    }

    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }

    public String getWykonawca() {
        return wykonawca;
    }

    public void setWykonawca(String wykonawca) {
        this.wykonawca = wykonawca;
    }

    public Double getCzasTrwania() {
        return czasTrwania;
    }

    public void setCzasTrwania(Double czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    public void utwórGra(Integer numer){
        notifyAllObservers(numer);
    }

    public void edytujUtwórTytuł(Utwór u, String tytuł){
        u.setTytuł(this.tytuł);

    }

    public void edytujUtwórWykonawca(Utwór u, String wykonawca){
        u.setWykonawca(wykonawca);
    }

    public void edytujUtwórCzas(Utwór u, Double czasTrwania){
        u.setCzasTrwania(czasTrwania);
    }

    public void notifyAllObservers(Integer numer){
        for (Bibloteka observer : biblioteki) {
            observer.update(numer);
        }
    }

    public void dodajBilioteke(Bibloteka bibloteka){
        biblioteki.add(bibloteka);
    }

    public void update2(Double nowaCena) {
        setCena(nowaCena);
    }
}
