package Uczniowie;

public class Przedmiot {
    private String nazwaPrzedmiotu;
    private int ocena;

    public Przedmiot(String nazwaPrzedmiotu, int ocena) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
        this.ocena = ocena;
    }

    public int getOcena() {
        return ocena;
    }

    public String getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }
}
