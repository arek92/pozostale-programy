package PokerEnum.model;

import java.util.*;


public class KartaDoGry {
    private String nazwaFigury;
    private SymbolKarty symboleKart;
    private int wartosc;


    public KartaDoGry(String nazwaFigury, int wartosc, SymbolKarty symboleKart) {
        this.nazwaFigury = nazwaFigury;
        this.symboleKart = symboleKart;
        this.wartosc = wartosc;
    }

    public int getWartosc() {
        return wartosc;
    }


    @Override
    public String toString() {
        return "\nKartaDoGry{" +
                "\nnazwaFigury='" + nazwaFigury + '\'' +
                ", \nsymboleKart=" + symboleKart +
                ", \nwartosc=" + wartosc +
                '}';
    }


    public static void rozgrywka(List<KartaDoGry> taliaKartNaPoczatku) {




    }
}