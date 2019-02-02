package model;

import java.math.BigDecimal;

public class Papierosy {

   private static int generator = 1; // dla id by kazdy byl inny

    private int id;                 // private by nie mogli zmieniac nam tych cen np w innych klasach
    private  String nazwa;
    private BigDecimal cena;
    private int ilosc;
    private String rodzaj;


    // kontruktor parametry ze wszystkimi parametrami (oprocz id)

    public Papierosy(String nazwa, BigDecimal cena, int ilosc, String rodzaj) {
        this.id = generator; // lub zapisac to po prostu tak:   this.id = generator;
        // static- optymalizacja dla stalej, by pojawiala sie tylko raz/statyczna - zmienna 1  dla wszystkich obiektow
        generator++;
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
        this.rodzaj = rodzaj;
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
