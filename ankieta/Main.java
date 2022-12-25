package ankieta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String odpowiedz;
        Scanner scanner = new Scanner(System.in);
        int liczbaGlosow = 0;
        int liczbaGlosowNaTak = 0;
        int liczbaGlosowNaNie = 0;

        double ileProcentStawiaNaFrancjeNaPoczatku = 0.0;



        do {

           double liczbaProcentRazem = 100.00;
            double ileProcentStawiaNaPolskeNaPoczatku = 0.0;

            System.out.println("Czy polska wygra z francja (Tak/Nie)");
            odpowiedz = scanner.nextLine();
            liczbaGlosow++;//liczba glosow zawsze zwieksz o 1
            System.out.println("Oddano " + " " + liczbaGlosow + " " + " liczbe glosow");
            if (odpowiedz.equals("Tak")) {
                liczbaGlosowNaTak++;
                System.out.println("Liczba osob ktora zaglosowala na tak to  " + " " + liczbaGlosowNaTak);
                System.out.println("Liczba osob ktora zaglosowala na nie to  " + " " + liczbaGlosowNaNie);
                double procent = liczbaProcentRazem/liczbaGlosow; //100.00/1
                System.out.println("procentowo na polske stawia : " + (Math.round(liczbaGlosowNaTak*procent)));
                System.out.println("procentowo na francje stawia : " + (Math.round(liczbaGlosowNaNie*procent)));

            }
            if (odpowiedz.equals("Nie")) {
                liczbaGlosowNaNie++;
                System.out.println("Liczba osob ktora zaglosowala na nie to " + " " + liczbaGlosowNaNie);
                System.out.println("Liczba osob ktora zaglosowala na tak to " + " " + liczbaGlosowNaTak);
                double procent = liczbaProcentRazem/liczbaGlosow; //100.00/1
                System.out.println("procentowo na polske stawia : " + (Math.round(liczbaGlosowNaNie*procent)));
                System.out.println("procentowo na francje stawia : " + (Math.round(liczbaGlosowNaTak*procent)));
                //jak obliczyc procent z akutalnej liczby glosow


            }


        } while (true);

    }

}

