package Logowanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logowanie {


    static List<Uzytkownik> listaUzytkownikow = new ArrayList<>();

    public static void main(String[] args) {
        Uzytkownik user1 = new Uzytkownik("Arkadiusz", "arkadiuszgalus85@gmail.com", "Zxcvb132");
        Uzytkownik user2 = new Uzytkownik("Kazik", "Kazik43@gmail.com", "Kazik1234");
        Uzytkownik user3 = new Uzytkownik("Monika", "Monia92@wp.pl", "Monia2611");
        listaUzytkownikow.add(user1);
        listaUzytkownikow.add(user2);
        listaUzytkownikow.add(user3);


        //String użytkownik = new String("Arkadiusz");
        Scanner scan = new Scanner(System.in);
        String loginWpisany;

        String hasloWpisane;
        String error = "";
        boolean niepoprawneDane;
        do {


            System.out.println(error);
            System.out.print(" Podaj login ");
            loginWpisany = scan.nextLine().trim();
            System.out.print(" Podaj haslo ");
            hasloWpisane = scan.nextLine().trim();
            niepoprawneDane = !findUser(loginWpisany, hasloWpisane);
            if (niepoprawneDane) {
                error = "Podales niepoprawny login lub haslo";
            }


        } while (niepoprawneDane);


    }

    static boolean findUser(String login, String haslo) {
        boolean znalazlem = false;
        for (Uzytkownik user : listaUzytkownikow) {
            znalazlem = login.equals(user.login) && haslo.equals(user.haslo);
            if(znalazlem){
                System.out.println(" Zalogowano do Systemu witaj " + user.imie);
                break;
            }


        }

        return znalazlem;
    }
}







