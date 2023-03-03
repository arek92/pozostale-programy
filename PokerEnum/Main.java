package PokerEnum;

import PokerEnum.dao.DAO;
import PokerEnum.model.KartaDoGry;
import PokerEnum.service.Service;

import java.util.*;
/*
O co chodzi w tej grze tasujemy karty kazdy z graczy losuje po 5 kart ma mozliwosc wymienic jedna potem na bazie wartosci sprawdzimy ilosc pkt


 */

public class Main {
  ;
   // static DAO dao = new DAO();

    public static void main(String[] args) {


        Service service = new Service();
        service.ileTaliaKartLiczyNaPoczatku();
        service.tasujKarty();
        System.out.println("Rozdaje 5 kart dla 1 gracza losujac je ");
        System.out.println("Karty pierwszego gracza to : ");

        service.rozgrywka();



    }
}




















