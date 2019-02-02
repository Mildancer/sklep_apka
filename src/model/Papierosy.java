package model;

import java.math.BigDecimal;

public class Papierosy extends Produkt {




    private int ilosc;
    private String rodzaj;


    // kontruktor parametry ze wszystkimi parametrami (oprocz id)

    public Papierosy(String nazwa, BigDecimal cena, int ilosc, String rodzaj) {
        super(nazwa, cena);
        this.ilosc = ilosc;
        this.rodzaj = rodzaj;
    }

    @Override
    public String toString(){
        return super.toString() + "\t"  +           // \t -tabulator
        this.rodzaj + "\t" +
                this.ilosc;

    }



}
