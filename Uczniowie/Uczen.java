package Uczniowie;

public class Uczen {
    private String imie;
    private String nazwisko;
    private ListaPrzedmiotow listaPrzedmiotow;


    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setListaPrzedmiotow(ListaPrzedmiotow listaPrzedmiotow) {
        this.listaPrzedmiotow = listaPrzedmiotow;
    }

    public ListaPrzedmiotow getListaPrzedmiotow() {
        return listaPrzedmiotow;
    }

    public float obliczSrednia(){
        int suma = 0;
        for(Przedmiot przedmiot:listaPrzedmiotow.listaPrzedmiotow) {
            suma += przedmiot.getOcena();
            //dwukropek po prawej stronie lista co mi czyta, a po lewej kolejny element i typ
        }
        return suma/listaPrzedmiotow.listaPrzedmiotow.size();

    }
    public boolean jestPromowany(){
        for(Przedmiot przedmiot : listaPrzedmiotow.listaPrzedmiotow) {
           if(przedmiot.getOcena() == 1){
               return false;
           }
            //dwukropek po prawej stronie lista co mi czyta, a po lewej kolejny element i tyo
        }
        return true;
    }
}

