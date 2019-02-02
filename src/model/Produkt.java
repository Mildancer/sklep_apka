package model;

import java.math.BigDecimal;

public class Produkt
{
    private static int generator = 1; // dla id by kazdy byl inny

    private int id;                 // private by nie mogli zmieniac nam tych cen np w innych klasach
    private  String nazwa;
    private BigDecimal cena;

    public Produkt(String nazwa, BigDecimal cena) {
        this.nazwa = nazwa;
        this.cena = cena;
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
