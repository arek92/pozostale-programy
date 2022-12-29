package Uczniowie;

import java.util.ArrayList;
import java.util.List;

public class  Uczniowie {
    static final float PASEK = 4.85f;

    public static void main(String[] args) {
        Uczen uczen1 = new Uczen("Arkadiusz", "Kowalski");
        Uczen uczen2 = new Uczen("Artur ", "Szczepaniak");
        Uczen uczen3 = new Uczen("Tomek ", "Korzeniak");
        ListaPrzedmiotow listaPrzedmiotowUczen1 = new ListaPrzedmiotow();
        listaPrzedmiotowUczen1.dodajOceny(3, 4, 6, 5, 4);
        uczen1.setListaPrzedmiotow(listaPrzedmiotowUczen1);
        ListaPrzedmiotow listaPrzedmiotowUczen2 = new ListaPrzedmiotow();
        listaPrzedmiotowUczen2.dodajOceny(4, 5, 5, 6, 6);
        uczen2.setListaPrzedmiotow(listaPrzedmiotowUczen2);
        ListaPrzedmiotow listaPrzedmiotowUczen3 = new ListaPrzedmiotow();
        listaPrzedmiotowUczen3.dodajOceny(4, 4, 5, 1, 6);
        uczen3.setListaPrzedmiotow(listaPrzedmiotowUczen3);
        List<Uczen> listaUczniow = new ArrayList<>(); //lista przechowuje obiekty klasy Uczniowie.Uczen
        listaUczniow.add(uczen1);
        listaUczniow.add(uczen2);
        listaUczniow.add(uczen3);

        sprawdzWynikiWnauce(uczen1);
        System.out.println("*********");
        sprawdzWynikiWnauce(uczen2);
        System.out.println("*********");
        sprawdzWynikiWnauce(uczen3);


        for (Uczen uczen : listaUczniow) {
            List<String> listaPrzedmiotow = new ArrayList<>();
            for (Przedmiot przedmiot : uczen.getListaPrzedmiotow().getListaPrzedmiotow()) {
                if (przedmiot.getOcena() == 6) {
                    listaPrzedmiotow.add(przedmiot.getNazwaPrzedmiotu());
                }
            }
            if(listaPrzedmiotow.size() != 0){
                System.out.println("Uczniowie.Uczen " + uczen.getImie() + " " + uczen.getNazwisko() + " ma ocene celujaca z " + listaPrzedmiotow);
            }
        }

    }

    static void sprawdzWynikiWnauce(Uczen uczen) {
        boolean jestPromowany = true;
        float srednia = uczen.obliczSrednia();
        if (uczen.obliczSrednia() >= PASEK && uczen.jestPromowany()) {
            System.out.println(uczen.getImie() + " " + uczen.getNazwisko() + " Brawo gratulacje dostajesz swiadectwo z paskiem!! Twoja srednia to " + srednia);
        } else if (uczen.obliczSrednia() < PASEK && uczen.jestPromowany()) {
            System.out.println(uczen.getImie() + " " + uczen.getNazwisko() + " Przechodzisz do nastepnej klasy ale do swiadectwa z paskiem zabraklo Ci " + (PASEK - srednia));
        } else {
            System.out.println(uczen.getImie() + " " + uczen.getNazwisko() + " Niestety nie przechodzisz do nastepnej klasy ");
        }


    }

}

