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

    public Papierosy() {
    }

    public int getIlosc() {
        return ilosc;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    @Override
    public String toString(){
        return super.toString() + "\t"  +           // \t -tabulator
        this.rodzaj + "\t" +
                this.ilosc;

    }



}
