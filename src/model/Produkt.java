package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.math.BigDecimal;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Alkohol.class, name = "alkohol"),
        @JsonSubTypes.Type(value = Papierosy.class, name = "papierosy")
})

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

    public Produkt(int id, String nazwa, BigDecimal cena) {
        this.id = id;
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Produkt() {
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public int getId(){
        return id;
    }

    @JsonIgnore                             //ignoruje w jsonie
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
