package model;

import java.math.BigDecimal;

public class Alkohol extends Produkt {



    private String pojemnosc;
    private  String procentAlkoholu;

    // kontruktor parametry ze wszystkimi parametrami (oprocz id)

    public Alkohol(String nazwa, BigDecimal cena, String pojemnosc, String procentAlkoholu) {
        // konstruktor klasy bazowej z ktorej dziedzinymy (Produkt-z parametrami produktu)

        super(nazwa, cena);
        this.pojemnosc = pojemnosc;
        this.procentAlkoholu = procentAlkoholu;
    }

    public String getTyp(){
        return "alko";
    }

}
