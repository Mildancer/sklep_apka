package io;

import model.Sklep;

import java.io.*;

public class PlikiBinarne {

    Sklep sklep = null;


    public Sklep odczyt() throws Exception{



            FileInputStream fileInputStream = new FileInputStream("Sklep.bin");//odczytywanie  z dysku
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            sklep =(Sklep) objectInputStream.readObject();        // (Zamowienie)-rzutowanie

            objectInputStream.close();
            fileInputStream.close();


        return sklep;

    }

  public void zapis (Sklep sklep){

      try {                   //sprobuj wykonac

          FileOutputStream fileOutputStream = new FileOutputStream("sklep.bin");                             // ".bin" -sugeruje, ze jest to plik  binarny

          ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);                                    //dekorator

          objectOutputStream.writeObject(sklep);                       //write moze przekazac cos

          objectOutputStream.close();
          fileOutputStream.close();

      } catch (FileNotFoundException e)                          //jezeli sie nie uda to zlap wyjatek
      {                                                                       // exception klasy, ktore dziedzicza z jakiejs  klasy
          System.out.println("brak dostepu do pliku zamowienie.bin");
          e.printStackTrace();                                                //podaje metody zostaly wywolane
      } catch (IOException e){
          System.out.println("wyjatek2");
      }



  }

}
