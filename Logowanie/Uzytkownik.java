package Logowanie;

public class Uzytkownik extends Thread {
      String login;
      String haslo;
      String imie;

    public Uzytkownik(String imie, String login, String haslo) {
        this.login = login;
        this.haslo = haslo;
        this.imie = imie;
    }
    @Override
    public void run(){
        System.out.println("Czy na pewno chcesz sie zalogowac?");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

