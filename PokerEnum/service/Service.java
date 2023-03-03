package PokerEnum.service;

import PokerEnum.dao.DAO;
import PokerEnum.model.KartaDoGry;

import java.util.*;

public class Service {

    private DAO dao = new DAO();

    public int ileTaliaKartLiczyNaPoczatku() {
        int ileTaliaKartLiczyNaPoczatku = dao.getAllCards().size();
        System.out.println("Talia kart na poczatku liczy " + ileTaliaKartLiczyNaPoczatku + " " + " karty ");

        return ileTaliaKartLiczyNaPoczatku;
    }

    public void tasujKarty() {
        System.out.println("Tasuje Karty ");
        Collections.shuffle(dao.getAllCards());
    }

    public void rozgrywka() {
        Random random = new Random();
        List<KartaDoGry> kartyWylosowaneGracz1 = new ArrayList<>();
        KartaDoGry kartaDoGryWylosowana1 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
        kartyWylosowaneGracz1.add(kartaDoGryWylosowana1);
        KartaDoGry kartaDoGryWylosowana2 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
        kartyWylosowaneGracz1.add(kartaDoGryWylosowana2);
        KartaDoGry kartaDoGryWylosowana3 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
        kartyWylosowaneGracz1.add(kartaDoGryWylosowana3);
        KartaDoGry kartaDoGryWylosowana4 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
        kartyWylosowaneGracz1.add(kartaDoGryWylosowana4);
        KartaDoGry kartaDoGryWylosowana5 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
        kartyWylosowaneGracz1.add(kartaDoGryWylosowana5);

        Scanner scanner = new Scanner(System.in);
        for (KartaDoGry kartaDoGry : kartyWylosowaneGracz1) {
            System.out.println(kartaDoGry);

        }
        dao.getAllCards().removeAll(kartyWylosowaneGracz1); //47
        System.out.println("Podaj indeksy kart ktore chcesz wymienic (usunac) od 0 do 4 ");
        System.out.println("Karty gracza 1 po wymianie chwilowo zostana ukryte ");

        int numerIndeksu = scanner.nextInt();

        switch (numerIndeksu) {
            case 0:
                KartaDoGry kartaWymieniona0 = kartyWylosowaneGracz1.remove(0);
                dao.getAllCards().add(kartaWymieniona0);
                KartaDoGry kartaWylosowanaNaMiejsceWymienionej = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
                kartyWylosowaneGracz1.add(kartaWylosowanaNaMiejsceWymienionej);
                dao.getAllCards().remove(kartaWylosowanaNaMiejsceWymienionej);

                break;


            case 1:
                KartaDoGry kartaWymieniona1 = kartyWylosowaneGracz1.remove(1);
                dao.getAllCards().add(kartaWymieniona1);
                KartaDoGry kartaWylosowanaNaMiejsceWymienionej1 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
                kartyWylosowaneGracz1.add(kartaWylosowanaNaMiejsceWymienionej1);
                dao.getAllCards().remove(kartaWylosowanaNaMiejsceWymienionej1);
                break;
            case 2:
                KartaDoGry kartaWymieniona2 = kartyWylosowaneGracz1.remove(2);
                dao.getAllCards().add(kartaWymieniona2);
                KartaDoGry kartaWylosowanaNaMiejsceWymienionej2 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
                kartyWylosowaneGracz1.add(kartaWylosowanaNaMiejsceWymienionej2);
                dao.getAllCards().remove(kartaWylosowanaNaMiejsceWymienionej2);
                break;
            case 3:
                KartaDoGry kartaWymieniona3 = kartyWylosowaneGracz1.remove(3);
                dao.getAllCards().add(kartaWymieniona3);
                KartaDoGry kartaWylosowanaNaMiejsceWymienionej3 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
                kartyWylosowaneGracz1.add(kartaWylosowanaNaMiejsceWymienionej3);
                dao.getAllCards().remove(kartaWylosowanaNaMiejsceWymienionej3);

                break;
            case 4:
                KartaDoGry kartaWymieniona4 = kartyWylosowaneGracz1.remove(4);
                dao.getAllCards().add(kartaWymieniona4);
                KartaDoGry kartaWylosowanaNaMiejsceWymienionej4 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
                kartyWylosowaneGracz1.add(kartaWylosowanaNaMiejsceWymienionej4);
                dao.getAllCards().remove(kartaWylosowanaNaMiejsceWymienionej4);
                break;

            case 5:
                System.out.println("Nie wymieniam zadnej karty ");
                // int ileTaliaKartLiczyJakNieWymienieZadnej = taliaKartNaPoczatku.size() - 5;
                // System.out.println("Talia kart gdy nie wymienie zadnej liczy :  " + ileTaliaKartLiczyJakNieWymienieZadnej + " " + " karty ");
                System.out.println("Jak powiedzielismy karty gracza 1 pozostana ukryte az do sprawdzenia");


        }
        System.out.println("Teraz kolej na 2 zawodnika rozdane mu zostanie 5 kart ");
        System.out.println("Jego Karty wylosowane to : ");


        List<KartaDoGry> kartyWylosowaneGracz2 = new ArrayList<>();
        KartaDoGry kartaDoGryWylosowana1Gracz2 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
        kartyWylosowaneGracz2.add(kartaDoGryWylosowana1Gracz2);
        KartaDoGry kartaDoGryWylosowana2Gracz2 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
        kartyWylosowaneGracz2.add(kartaDoGryWylosowana2Gracz2);
        KartaDoGry kartaDoGryWylosowana3Gracz2 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
        kartyWylosowaneGracz2.add(kartaDoGryWylosowana3Gracz2);
        KartaDoGry kartaDoGryWylosowana4Gracz2 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
        kartyWylosowaneGracz2.add(kartaDoGryWylosowana4Gracz2);
        KartaDoGry kartaDoGryWylosowana5Gracz2 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
        kartyWylosowaneGracz2.add(kartaDoGryWylosowana5Gracz2);

        for (
                KartaDoGry kartaDoGry : kartyWylosowaneGracz2) {
            System.out.println(kartaDoGry);

        }
        dao.getAllCards().removeAll(kartyWylosowaneGracz2);
        int liczbaKartPoWylosowaniuPrzez2Graczy = dao.getAllCards().size();
        System.out.println("Talia kart po wylosowaniu 5 kart dla Gr2 liczy " + " " + liczbaKartPoWylosowaniuPrzez2Graczy);


        System.out.println("Podaj indeksy kart ktore chcesz wymienic (usunac) od 0 do 4 ");
        int numerIndeksu2 = scanner.nextInt();
        switch (numerIndeksu2) {
            case 0:
                KartaDoGry kartaWymieniona0 = kartyWylosowaneGracz2.remove(0);
                dao.getAllCards().add(kartaWymieniona0);
                KartaDoGry kartaWylosowanaNaMiejsceWymienionej = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
                kartyWylosowaneGracz2.add(kartaWylosowanaNaMiejsceWymienionej);
                dao.getAllCards().remove(kartaWylosowanaNaMiejsceWymienionej);
                break;
            case 1:
                KartaDoGry kartaWymieniona1 = kartyWylosowaneGracz2.remove(1);
                dao.getAllCards().add(kartaWymieniona1);
                KartaDoGry kartaWylosowanaNaMiejsceWymienionej1 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
                kartyWylosowaneGracz2.add(kartaWylosowanaNaMiejsceWymienionej1);
                dao.getAllCards().remove(kartaWylosowanaNaMiejsceWymienionej1);
                break;
            case 2:
                KartaDoGry kartaWymieniona2 = kartyWylosowaneGracz2.remove(2);
                dao.getAllCards().add(kartaWymieniona2);
                KartaDoGry kartaWylosowanaNaMiejsceWymienionej2 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
                kartyWylosowaneGracz2.add(kartaWylosowanaNaMiejsceWymienionej2);
                dao.getAllCards().remove(kartaWylosowanaNaMiejsceWymienionej2);
                break;
            case 3:
                KartaDoGry kartaWymieniona3 = kartyWylosowaneGracz2.remove(3);
                dao.getAllCards().add(kartaWymieniona3);
                KartaDoGry kartaWylosowanaNaMiejsceWymienionej3 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
                kartyWylosowaneGracz2.add(kartaWylosowanaNaMiejsceWymienionej3);
                dao.getAllCards().remove(kartaWylosowanaNaMiejsceWymienionej3);
                break;
            case 4:
                KartaDoGry kartaWymieniona4 = kartyWylosowaneGracz2.remove(4);
                dao.getAllCards().add(kartaWymieniona4);
                KartaDoGry kartaWylosowanaNaMiejsceWymienionej4 = dao.getAllCards().get(random.nextInt(dao.getAllCards().size()));
                kartyWylosowaneGracz2.add(kartaWylosowanaNaMiejsceWymienionej4);
                dao.getAllCards().remove(kartaWylosowanaNaMiejsceWymienionej4);
                break;
            case 5:
                System.out.println("Nie wymieniam zadnej karty ");
                System.out.println("moje karty to te ktore mi rozdano wylosowano");
                for (KartaDoGry kartaDoGry : kartyWylosowaneGracz2) {
                    System.out.println(kartaDoGry);

                }
        }
        int liczbaKartPo1Wymianie = dao.getAllCards().size();
        System.out.println("Liczba kart po 2 wymianie to " + liczbaKartPo1Wymianie + " " + " kart ");

        System.out.println("Teraz czas na odkrycie kart i porownanie ");
        System.out.println("Karty gracza pierwszego to :");
        for (KartaDoGry kartaDoGry : kartyWylosowaneGracz1) {
            System.out.println(kartaDoGry);

        }


        for (KartaDoGry wartosc : kartyWylosowaneGracz1) {
            System.out.println("wartosc punktow za poszczegolne karty to kolejno : " + wartosc.getWartosc());
        }
        int sumaPunktowGracz1 = kartyWylosowaneGracz1.get(0).getWartosc() + kartyWylosowaneGracz1.get(1).getWartosc() +
                kartyWylosowaneGracz1.get(2).getWartosc() + kartyWylosowaneGracz1.get(3).getWartosc() + kartyWylosowaneGracz1.get(4).getWartosc();
        System.out.println("Suma punktow gracza 1 to " + sumaPunktowGracz1 + " " + " punktow ");

        for (KartaDoGry wartosc2 : kartyWylosowaneGracz2) {
            System.out.println("wartosc punktow za poszczegolne karty to kolejno : " + wartosc2.getWartosc());

        }
        int sumaPunktowGracz2 = kartyWylosowaneGracz2.get(0).getWartosc() + kartyWylosowaneGracz2.get(1).getWartosc() +
                kartyWylosowaneGracz2.get(2).getWartosc() + kartyWylosowaneGracz2.get(3).getWartosc() + kartyWylosowaneGracz2.get(4).getWartosc();
        System.out.println("Suma punktow gracza 2 to : " + sumaPunktowGracz2);

        String wynik;
        wynik = (sumaPunktowGracz1 > sumaPunktowGracz2) ? "wygral gracz1 " : " Wygral gracz 2 ";
        System.out.println(" wynik gry : " + " " + wynik);


    }
}



