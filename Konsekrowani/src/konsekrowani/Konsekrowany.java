package konsekrowani;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Konsekrowany {
    private String firstName;
    private String lastName;
    private String oasis;
    private LocalDate birthday;
    List<EtapWspolnotowy> listaEtapowWspolnotowych;


    public Konsekrowany(String firstName, String lastname, String oasis, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.oasis = oasis;
        this.birthday = LocalDate.of(year, month, day);
        listaEtapowWspolnotowych = new ArrayList<>();//stworz mi pusta liste i przypisz do zmiennej

    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getOasis() {
        return oasis;
    }


    public void dodajEtapWspolnotowy(EtapWspolnotowy etapWspolnotowy) {//deklaruje ,,pole,, w metodzie jej argument przekazywany
        listaEtapowWspolnotowych.add(etapWspolnotowy);


    }

    public List<EtapWspolnotowy> getListaEtapowWspolnotowych() {
        return listaEtapowWspolnotowych;
    }

    @Override
    public String toString() {
        return "Konsekrowany{" +
                "\nfirstName='" + firstName + '\'' +
                ", \nlastName='" + lastName + '\'' +
                ", \noasis='" + oasis + '\'' +
                ", \nbirthday=" + birthday +
                ", \nlistaEtapowWspolnotowych=" + listaEtapowWspolnotowych +
                '}';
    }





        }








