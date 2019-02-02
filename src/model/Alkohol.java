package model;

import java.math.BigDecimal;

public class Alkohol extends Produkt {

   private static int generator = 1; // dla id by kazdy byl inny

    private int id;                 // private by nie mogli zmieniac nam tych cen np w innych klasach
    private  String nazwa;
    private BigDecimal cena;
    private String pojemnosc;
    private  String procentAlkoholu;

    // kontruktor parametry ze wszystkimi parametrami (oprocz id)

    public Alkohol(String nazwa, BigDecimal cena, String pojemnosc, String procentAlkoholu) {
        this.id = generator; // lub zapisac to po prostu tak:   this.id = generator;
        // static- optymalizacja dla stalej, by pojawiala sie tylko raz/statyczna - zmienna 1  dla wszystkich obiektow
        generator++;
        this.nazwa = nazwa;
        this.cena = cena;
        this.pojemnosc = pojemnosc;
        this.procentAlkoholu = procentAlkoholu;
    }

    public int getId(){
        return id;
    }


    @Override                      // kompilator wyswietli blad, gdy zrobimy literowke- poinformuje nas podczas kompilacji
    public String toString(){                 // konwersja obiektu na string
        return
        getId() + "\t" + this.nazwa + "\t"+ this.cena + " PLN";                  // this z tej klasy


    }


}
