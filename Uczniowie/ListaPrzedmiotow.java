package Uczniowie;

import java.util.ArrayList;
import java.util.List;

public class ListaPrzedmiotow {
   List<Przedmiot> listaPrzedmiotow;

    public List<Przedmiot> dodajOceny(int matematyka, int polski, int fizyka, int WF, int niemiecki) {//zwraca typ listy
        listaPrzedmiotow = new ArrayList<>();
        listaPrzedmiotow.add(new Przedmiot("Matematyka",matematyka));
        listaPrzedmiotow.add(new Przedmiot("Polski",polski));
        listaPrzedmiotow.add(new Przedmiot("Fizyka",fizyka));
        listaPrzedmiotow.add(new Przedmiot("WF",WF));
        listaPrzedmiotow.add(new Przedmiot("Niemiecki",niemiecki));
        return listaPrzedmiotow;
    }

    public List<Przedmiot> getListaPrzedmiotow() {
        return listaPrzedmiotow;
    }
}

