package model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Produkt implements Serializable
{
    private static int generator = 1; // dla id by kazdy byl inny

    private int id;                 // private by nie mogli zmieniac nam tych cen np w innych klasach
    private  String nazwa;
    private BigDecimal cena;

    public Produkt(String nazwa, BigDecimal cena) {
        this.id = generator++;
        this.nazwa = nazwa;
        this.cena = cena;
    }


    public int getId(){
        return id;
    }

    public String getTyp(){
        return "produkt";

    }

    @Override                      // kompilator wyswietli blad, gdy zrobimy literowke- poinformuje nas podczas kompilacji
    public String toString(){                 // konwersja obiektu na string
        return
                getId() + "\t"
                        + getTyp() + "\t"
                        + this.nazwa + "\t"
                        + this.cena + " PLN";                  // this z tej klasy


    }

}
