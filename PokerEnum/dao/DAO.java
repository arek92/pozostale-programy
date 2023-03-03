package PokerEnum.dao;

import PokerEnum.model.SymbolKarty;
import PokerEnum.model.KartaDoGry;

import java.util.ArrayList;
import java.util.List;

public class DAO {

    public List<KartaDoGry> getAllCards() {
        List<KartaDoGry> taliaKartNaPoczatku = new ArrayList<>();
        taliaKartNaPoczatku.add(new KartaDoGry("Walet", 20, SymbolKarty.PIK));
        taliaKartNaPoczatku.add(new KartaDoGry("Dama", 30, SymbolKarty.PIK));
        taliaKartNaPoczatku.add(new KartaDoGry("Krol", 40, SymbolKarty.PIK));
        taliaKartNaPoczatku.add(new KartaDoGry("As ", 50, SymbolKarty.PIK));
        taliaKartNaPoczatku.add(new KartaDoGry("Walet ", 20, SymbolKarty.CARO));
        taliaKartNaPoczatku.add(new KartaDoGry("Dama ", 30, SymbolKarty.CARO));
        taliaKartNaPoczatku.add(new KartaDoGry("Krol ", 40, SymbolKarty.CARO));
        taliaKartNaPoczatku.add(new KartaDoGry("As", 50, SymbolKarty.CARO));
        taliaKartNaPoczatku.add(new KartaDoGry("Walet", 20, SymbolKarty.TREFL));
        taliaKartNaPoczatku.add(new KartaDoGry("Dama", 30, SymbolKarty.TREFL));
        taliaKartNaPoczatku.add(new KartaDoGry("Krol", 40, SymbolKarty.TREFL));
        taliaKartNaPoczatku.add(new KartaDoGry("As", 50, SymbolKarty.TREFL));
        taliaKartNaPoczatku.add(new KartaDoGry("Walet", 20, SymbolKarty.KIER));
        taliaKartNaPoczatku.add(new KartaDoGry("Dama", 30, SymbolKarty.KIER));
        taliaKartNaPoczatku.add(new KartaDoGry("Krol", 40, SymbolKarty.KIER));
        taliaKartNaPoczatku.add(new KartaDoGry("As", 50, SymbolKarty.KIER));
        taliaKartNaPoczatku.add(new KartaDoGry("Dwojka", 2, SymbolKarty.KIER)); //16
        taliaKartNaPoczatku.add(new KartaDoGry("Dwojka", 2, SymbolKarty.PIK));//17
        taliaKartNaPoczatku.add(new KartaDoGry("Dwojka", 2, SymbolKarty.TREFL));//18
        taliaKartNaPoczatku.add(new KartaDoGry("Dwojka", 2, SymbolKarty.CARO));//19
        taliaKartNaPoczatku.add(new KartaDoGry("Trojka", 3, SymbolKarty.KIER));//20
        taliaKartNaPoczatku.add(new KartaDoGry("TRojka", 3, SymbolKarty.PIK));//21
        taliaKartNaPoczatku.add(new KartaDoGry("Trojka", 3, SymbolKarty.TREFL));//22
        taliaKartNaPoczatku.add(new KartaDoGry("Trojka", 3, SymbolKarty.CARO));//23
        taliaKartNaPoczatku.add(new KartaDoGry("Czworka", 4, SymbolKarty.KIER));//24
        taliaKartNaPoczatku.add(new KartaDoGry("Czworka", 4, SymbolKarty.PIK));//25
        taliaKartNaPoczatku.add(new KartaDoGry("Czworka", 4, SymbolKarty.TREFL));//26
        taliaKartNaPoczatku.add(new KartaDoGry("Czworka", 4, SymbolKarty.CARO));//27
        taliaKartNaPoczatku.add(new KartaDoGry("Piatka", 5, SymbolKarty.KIER));//28
        taliaKartNaPoczatku.add(new KartaDoGry("Piatka", 5, SymbolKarty.PIK));//29
        taliaKartNaPoczatku.add(new KartaDoGry("Piatka", 5, SymbolKarty.TREFL));//30
        taliaKartNaPoczatku.add(new KartaDoGry("Piatka", 5, SymbolKarty.CARO));//31
        taliaKartNaPoczatku.add(new KartaDoGry("Szostka", 6, SymbolKarty.KIER));
        taliaKartNaPoczatku.add(new KartaDoGry("Szostka", 6, SymbolKarty.PIK));
        taliaKartNaPoczatku.add(new KartaDoGry("Szostka", 6, SymbolKarty.TREFL));
        taliaKartNaPoczatku.add(new KartaDoGry("Szostka", 6, SymbolKarty.CARO));
        taliaKartNaPoczatku.add(new KartaDoGry("Siodemka", 7, SymbolKarty.KIER));
        taliaKartNaPoczatku.add(new KartaDoGry("Siodemka", 7, SymbolKarty.PIK));
        taliaKartNaPoczatku.add(new KartaDoGry("Siodemka", 7, SymbolKarty.TREFL));
        taliaKartNaPoczatku.add(new KartaDoGry("Siodemka", 7, SymbolKarty.CARO));
        taliaKartNaPoczatku.add(new KartaDoGry("Osemka", 8, SymbolKarty.KIER));
        taliaKartNaPoczatku.add(new KartaDoGry("Osemka", 8, SymbolKarty.PIK));
        taliaKartNaPoczatku.add(new KartaDoGry("Osemka", 8, SymbolKarty.TREFL));
        taliaKartNaPoczatku.add(new KartaDoGry("Osemka", 8, SymbolKarty.CARO));
        taliaKartNaPoczatku.add(new KartaDoGry("Dziewiatka", 9, SymbolKarty.KIER));
        taliaKartNaPoczatku.add(new KartaDoGry("Dziewiatka", 9, SymbolKarty.PIK));
        taliaKartNaPoczatku.add(new KartaDoGry("Dziewiatka", 9, SymbolKarty.TREFL));
        taliaKartNaPoczatku.add(new KartaDoGry("Dziewiatka", 9, SymbolKarty.CARO));
        taliaKartNaPoczatku.add(new KartaDoGry("Dziesiatka", 10, SymbolKarty.KIER));
        taliaKartNaPoczatku.add(new KartaDoGry("Dziesiatka", 10, SymbolKarty.PIK));
        taliaKartNaPoczatku.add(new KartaDoGry("Dziesiatka", 10, SymbolKarty.TREFL));
        taliaKartNaPoczatku.add(new KartaDoGry("Dziesiatka", 10, SymbolKarty.CARO));
        return taliaKartNaPoczatku;
    }
}
