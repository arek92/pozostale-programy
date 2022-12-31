package konsekrowani;

import konsekrowani.service.KonsekrowaniService;

import java.util.Scanner;

import static konsekrowani.Konsekrowany.*;


public class Main {

    private static KonsekrowaniService service;

    public static void main(String[] args) {

        service = new KonsekrowaniService();
        service.poczatekProgramu();
        service.krotkaInstukcjaDoProgramuGlownego();
        wyswietlMenu();
        Scanner scanner = new Scanner(System.in);
        // krotkaInstukcjaDoProgramuGlownego();
        int numer = scanner.nextInt();
        if (numer == 0) {
            System.out.println("Wciskajac 0 opuszczasz program");
            service.zamykanieProgramu();
        } else {

            service.programGlowny();

        }


    }
    public static void wyswietlMenu() {

        System.out.println("1. Wyswietl wszystkich konsekrowanych");
        System.out.println("2. Znajdz wydarzenie po dacie");
        System.out.println("3. czy dzisiaj ktoś ma urodziny?");
        System.out.println("4. Konsekrowani z tej samej oazy");
        System.out.println("5. ile dni minelo od wejscia do slubow wieczystych");
        System.out.println("0. Wyjście z programu");
        System.out.println("----------------------------------");

    }
}
