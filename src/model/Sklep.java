package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sklep {

    private String nazwa;

    private List<Alkohol> alkohole;  //lista -array-lista bazujaca na tablicy. link lista


    // kosntruktor sklepu

    public Sklep(String nazwa) {
        this.nazwa = nazwa;
        this.alkohole = new ArrayList<>();
    }

    public void dodajAlkohol(Alkohol alkohol) {          //metoda
        alkohole.add(alkohol);                          //add dodaje do listy
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
        Iterator<Alkohol> iterator = alkohole.iterator();

        while (((Iterator) iterator).hasNext()){
            Alkohol alkohol = iterator.next();
            if (alkohol.getId() == id){
                iterator.remove();
            }
        }

    }
    public void wyswietl() {
        System.out.println(alkohole); //wyswietl liste alkoholi
    }


}
