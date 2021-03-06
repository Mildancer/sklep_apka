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

    public Alkohol() {

    }

    public String getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(String pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public void setProcentAlkoholu(String procentAlkoholu) {
        this.procentAlkoholu = procentAlkoholu;
    }

    public String getProcentAlkoholu() {
        return procentAlkoholu;
    }

    public String getTyp(){
        return "alko";
    }


    @Override
    public String toString(){
        return super.toString() + "\t"  +           // \t -tabulator
                this.pojemnosc + "\t" +
                this.procentAlkoholu;

    }

}
