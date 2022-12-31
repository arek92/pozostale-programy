package konsekrowani.service;

import konsekrowani.Etap;
import konsekrowani.EtapWspolnotowy;
import konsekrowani.Konsekrowany;
import konsekrowani.dao.BazaDanych;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import static konsekrowani.Konsekrowany.*;
import static konsekrowani.Main.wyswietlMenu;

public class KonsekrowaniService {

    private static BazaDanych bazaDanych;
    public static int miesiac;
    public static int rok;
    public static int dzien;
    static int rok1;
    static int miesiac1;
    static int dzien1;



    public KonsekrowaniService() {
        bazaDanych = new BazaDanych();
    }

    public static void wyswietlWszystkichKonsekrowanych() {
        System.out.println("Lista konsekrowanych:");
        System.out.println("***********************");
        for (Konsekrowany konsekrowany : bazaDanych.findAll()) {
            System.out.println(" MOj konsekrowany to " + " " + konsekrowany.getFirstName() + konsekrowany.getLastName() + " " + " przebywa w oazie " +
                    " " + konsekrowany.getOasis() + " " + " jego data urodzenia to  " + konsekrowany.getBirthday() + " " +
                    " a jego etapy wspolnotowe to " + " " + konsekrowany.getListaEtapowWspolnotowych());
            System.out.println("***********");
        }
    }

    public void znajdzUrodziny() {
        System.out.println("Dziś mają urodziny: ");
        LocalDate dzisiejszaData = LocalDate.now();
        boolean ktosMaDzisUrodziny = false;

        for (Konsekrowany konsekrowany : bazaDanych.findAll()) {
            if (konsekrowany.getBirthday().equals(dzisiejszaData)) {
                System.out.println(konsekrowany.getFirstName() + " " + konsekrowany.getLastName() + "ma dziś urodziny");
                ktosMaDzisUrodziny = true;
            }
        }
        if (!ktosMaDzisUrodziny) {
            System.out.println("Dziś nikt nie ma urodzin");
        }
    }

    public void coChceszZrobic() {
        Scanner scanner = new Scanner(System.in);
        String dostepnaOpcja;
        System.out.println("Czy na pewno chcesz wyjsc (T/N)");
        String odpowiedz = scanner.nextLine();
        if (odpowiedz.equals("T")) {
            System.exit(Integer.parseInt("0"));
        }
        if (odpowiedz.equals("N")) {
            wyswietlMenu();
            programGlowny();
        } else {
            do {
                System.out.println("Odpowiedz mozliwa to T lub N podaj wlasciwa");
                odpowiedz = scanner.nextLine();

            } while (!odpowiedz.equals("T") && (!odpowiedz.equals("N")));
        }
        if (odpowiedz.equals("T")) {
            System.exit(Integer.parseInt("0"));
        }
        if (odpowiedz.equals("N")) {
            wyswietlMenu();
            programGlowny();

        }
    }

    public void zamykanieProgramu() {
        Scanner scanner1 = new Scanner(System.in);
        String dostepnaOpcja1;
        System.out.println("Czy na pewno chcesz wyjsc (T/N)");
        String odpowiedzCzyWyjsc = scanner1.nextLine();
        if (odpowiedzCzyWyjsc.equals("T")) {
            System.exit(Integer.parseInt("0"));
            if (odpowiedzCzyWyjsc.equals("N")) {
                programGlowny();
            }
        }
    }

    public void programGlowny() {
        Scanner scanner = new Scanner(System.in);
        String numer1 = "Wyswietl wszystkich konsekrowanych";
        String numer2 = "znajdz wydarzenie po dacie";
        String numer3 = "czy dzisiaj ktoś ma urodziny?";
        String numer4 = "Konsekrowani z tej samej oazy ";
        String numer5 = "ile dni minelo od wejscia do slubow wieczystych";
        int numer = scanner.nextInt();
        if (numer == 0) {
            // System.out.println("Wciskajac 0 opuszczasz program");
            coChceszZrobic();
        }
        if (numer > 5) {
            do {
                krotkaInstukcjaDoProgramuGlownego();
                if (numer == 0) {
                    coChceszZrobic();
                } else {
                    programGlowny();
                }
                numer = scanner.nextInt();
            } while (numer > 5);
        } else {

            switch (numer) {
                case 1:
                    System.out.println(numer1);
                    wyswietlWszystkichKonsekrowanych();
                    coChceszZrobic();
                    break;

                case 2:
                    System.out.println(numer2);
                    znajdzWydarzeniePoDacie();
                    coChceszZrobic();
                    break;

                case 3:
                    System.out.println(numer3);
                    znajdzUrodziny();
                    coChceszZrobic();
                    break;

                case 4:
                    System.out.println(numer4);
                    ktoJestZTejSamejOazy();
                    coChceszZrobic();
                    break;

                case 5:
                    System.out.println(numer5);
                    ileDniMineloOdWejsciaDoSlubowWieczystych();
                    coChceszZrobic();
            }
        }
    }

    public void krotkaInstukcjaDoProgramuGlownego() {
        System.out.println("Za chwile zostaniesz poproszony o wpisanie liczby z zakresu od 1 do 5 w przypadku wpisania innego znaku niz liczba program zakonczy sie" +
                " wpisujac zero bedziesz mogl wyjsc z programu ");


    }
    public  void poczatekProgramu() {
        Scanner scanner = new Scanner(System.in);
        String dostepnaOpcja;
        System.out.println("Wcisnij 1 aby wejsc do Menu Glownego /wcisnij 0 by zakonczyc");
        dostepnaOpcja = scanner.nextLine();

        if (dostepnaOpcja.equals("0")) {
            zamykanieProgramu();
        }
        if (dostepnaOpcja.equals("1")) {
            wyswietlMenu();
            programGlowny();
        } else
            do {
                System.out.println("Nie ma takiej opcji");
                coChceszZrobic();
            } while (!dostepnaOpcja.equals("0") && (!dostepnaOpcja.equals("1")));
    }
    public void ktoJestZTejSamejOazy() {

        Scanner scanner = new Scanner(System.in);
        String nazwaOazy;
        System.out.println("Podaj nazwe Oazy");
        nazwaOazy = scanner.nextLine();

        for (Konsekrowany konsekrowany : bazaDanych.findAll()) {
            if (nazwaOazy.equals(konsekrowany.getOasis())) {
                System.out.println(" z oazy " + nazwaOazy + " sa " + " " + konsekrowany.getFirstName() + " " + konsekrowany.getLastName());
            }
        }
    }
    public void znajdzWydarzeniePoDacie() {
        pobierzDateWydarzenia();
        for (Konsekrowany konsekrowany : bazaDanych.findAll()) {
            for (EtapWspolnotowy etapWspolnotowy : konsekrowany.getListaEtapowWspolnotowych()) {
                if ((LocalDate.of(rok, miesiac, dzien).equals(etapWspolnotowy.getDataEtapu()))) {
                    System.out.println(" dnia " + etapWspolnotowy.getDataEtapu() + " " + konsekrowany.getFirstName() +
                            " " + konsekrowany.getLastName() + " ma wydarzenie jakim jest " + etapWspolnotowy.getNazwaEtapu());

                } else {
                    System.out.println("Nie ma takiego wydarzenia ");
                }

            }
        }
    }
    public static void pobierzDateWydarzenia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj date wydarzenia ");
        System.out.print("rok : ");
        rok = scanner.nextInt();
        System.out.print("miesiac ");
        miesiac = scanner.nextInt();
        System.out.print("dzien ");
        dzien = scanner.nextInt();
    }
    public static void ileDniMineloOdWejsciaDoSlubowWieczystych() {
        Konsekrowany konsekrowany1 = new Konsekrowany("Tomek", "Parzecki", "Puebla", 1992, 12, 25);
        Konsekrowany konsekrowany2 = new Konsekrowany("Anna", "Maria", "Roma", 1979, 5, 20);
        Konsekrowany konsekrowany3 = new Konsekrowany("Pablo", "Garcia", "Nowy Radzic", 1980, 6, 13);
        Konsekrowany konsekrowany4 = new Konsekrowany("Franceska", "Gagliardi", "Roma", 1965, 5, 17);
        konsekrowany1.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.ENTRATA, 1992, 5, 25));
        konsekrowany1.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RICHIESTA, 1992, 7, 25));
        konsekrowany1.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.PRIMIVOTI, 1994, 6, 20));
        konsekrowany1.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RINNOVO, 1997, 6, 20));
        konsekrowany1.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.VOTI_PERPETUI, 2000, 5, 14));

        konsekrowany2.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.ENTRATA, 1995, 3, 14));
        konsekrowany2.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RICHIESTA, 1995, 5, 14));
        konsekrowany2.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.PRIMIVOTI, 1997, 6, 20));
        konsekrowany2.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RINNOVO, 2000, 7, 24));
        konsekrowany2.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.VOTI_PERPETUI, 2003, 8, 15));

        konsekrowany3.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.ENTRATA, 1998, 1, 1));
        konsekrowany3.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RICHIESTA, 1998, 3, 13));
        konsekrowany3.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.PRIMIVOTI, 2000, 5, 23));
        konsekrowany3.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RINNOVO, 2003, 5, 18));
        konsekrowany3.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.VOTI_PERPETUI, 2006, 8, 15));

        konsekrowany4.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.ENTRATA, 1985, 07, 20));
        konsekrowany4.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RICHIESTA, 1985, 10, 29));
        konsekrowany4.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.PRIMIVOTI, 1986, 8, 5));
        konsekrowany4.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.RINNOVO, 1989, 9, 14));
        konsekrowany4.dodajEtapWspolnotowy(new EtapWspolnotowy(Etap.VOTI_PERPETUI, 1992, 8, 15));
        List<Konsekrowany> listaKonsekrowanych = new ArrayList<>();
        listaKonsekrowanych.add(konsekrowany1);
        listaKonsekrowanych.add(konsekrowany2);
        listaKonsekrowanych.add(konsekrowany3);
        listaKonsekrowanych.add(konsekrowany4);

        EtapWspolnotowy entrata1 = konsekrowany1.getListaEtapowWspolnotowych().get(0);
        System.out.println(entrata1);
        EtapWspolnotowy perpetui1 = konsekrowany1.getListaEtapowWspolnotowych().get(4);
        System.out.println(perpetui1);
        System.out.println("******************");
        System.out.println("KOnsekrowany 2 = Anna Maria");
        EtapWspolnotowy entrata2 = konsekrowany2.getListaEtapowWspolnotowych().get(0);
        System.out.println(entrata2);
        EtapWspolnotowy perpetui2 = konsekrowany2.getListaEtapowWspolnotowych().get(4);
        System.out.println(perpetui2);
        System.out.println("***********************");
        System.out.println("KOnsekrowany 3 = Pablo Garcia");
        EtapWspolnotowy entrata3 = konsekrowany3.getListaEtapowWspolnotowych().get(0);
        System.out.println(entrata3);
        EtapWspolnotowy perpetui3 = konsekrowany3.getListaEtapowWspolnotowych().get(4);
        System.out.println(perpetui3);
        System.out.println("*****************");
        System.out.println("KOnsekrowany 4 = Francesca Gagliardi");
        EtapWspolnotowy entrata4 = konsekrowany4.getListaEtapowWspolnotowych().get(0);
        System.out.println(entrata4);
        EtapWspolnotowy perpetui4 = konsekrowany4.getListaEtapowWspolnotowych().get(4);
        System.out.println(perpetui4);
        System.out.println("******************");
        podpowiedz();
        ObliczIloscDniMiedzyEtapami();
    }





    public static void ObliczIloscDniMiedzyEtapami() {
        pobierzDateWydarzenia();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj date wydarzenia 2 ");
        System.out.println("rok : ");
        rok1 = scanner1.nextInt();
        System.out.println("Miesiac : ");
        miesiac1 = scanner1.nextInt();
        System.out.println("dzien");
        dzien1 = scanner1.nextInt();

        LocalDate data1 = LocalDate.of(rok, miesiac, dzien);
        LocalDate data2 = LocalDate.of(rok1, miesiac1, dzien1);

        long period = ChronoUnit.DAYS.between(data1, data2);
        int liczbaDniWRoku = 365;
        long liczbaLat = (period / liczbaDniWRoku);
        System.out.println(" Liczba dni ktora minela od wejscia to " + period);
        System.out.println(" Jest to " + " " + " okolo " + " " + liczbaLat + " " + " lat ");

    }


    public static void podpowiedz() {
        System.out.println("SKorzystaj z podpowiedzi sa to informacje o datach konsekrowanych poszczegolnych etapow ");
        System.out.println("wpisz te daty by dowiedziec sie ile lat zajela osobie formacja od entraty do slubow wieczystych ");
        System.out.println("jako pierwsze wpisz rok dzien i miesiac daty entraty jako drugie date slubow wieczystych ");

    }
}


