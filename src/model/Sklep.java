package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sklep {

    private String nazwa;

    private List<Alkohol> alkohole;  //lista -array-lista bazujaca na tablicy. link lista

    private  List<Papierosy> papierosy;


    // kosntruktor sklepu

    public Sklep(String nazwa) {
        this.nazwa = nazwa;
        this.alkohole = new ArrayList<>();
        this.papierosy = new ArrayList<>();

    }

    public void dodajAlkohol(Alkohol alkohol) {          //metoda
        alkohole.add(alkohol);                          //add dodaje do listy
    }

    public void dodajPapierosy(Papierosy papieros) {          //metoda
        papierosy.add(papieros);                          //add dodaje do listy
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
        for (Alkohol alkohol : alkohole) {
            System.out.println(alkohole); //wyswietl liste alkoholi
        }
    }

    public String toString(){
        String rezultat = "id\tnazwa\tcena\n";
        for (Alkohol alkohol : alkohole){
            rezultat += alkohol + "\n";// "\n"; - nowa
        }
        for (Papierosy papierosy : papierosy){
            rezultat += papierosy + "\n";// "\n"; - nowa linia
        }
        return rezultat;
    }



}
