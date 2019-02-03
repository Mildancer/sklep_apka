package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sklep implements Serializable {

    private String nazwa;

    private List<Produkt> produkty;  //lista -array-lista bazujaca na tablicy. link lista

    public Sklep(String nazwa, List<Produkt> produkty) {
        this.nazwa = nazwa;
        this.produkty = produkty;
    }


// kosntruktor sklepu

    public Sklep(String nazwa) {
        this.nazwa = nazwa;
        this.produkty = new ArrayList<>();

    }

    public Sklep() {
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setProdukty(List<Produkt> produkty) {
        this.produkty = produkty;
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public void dodaj(Produkt produkt) {          //metoda
        produkty.add(produkt);                          //add dodaje do listy
    }

    public void usunAlkohol(int id){
      /*  inny przyklad
        fot (Alkohol alkohol : alkohole ){
            if (alkohol.id == id){
                alkohole.remove(alkohol);
            }
        }
       */
      //iterator przechodzenie przez kolekcje  i ja usuwanie  bez problemow
        Iterator<Produkt> iterator = produkty.iterator();

        while (((Iterator) iterator).hasNext()){
            Produkt produkt = iterator.next();
            if (produkt.getId() == id){
                iterator.remove();
            }
        }

    }
    public void wyswietl() {
        for (Produkt produkt : produkty) {
            System.out.println(produkt); //wyswietl liste alkoholi
        }
    }

    public String toString(){
        String rezultat = "id\ttyp\tnazwa\tcena\tinne\n";
        for (Produkt produkt : produkty){
            rezultat += produkt + "\n";// "\n"; - nowa
        }

        return rezultat;
    }



}
