package ui_user_interface;

import model.Alkohol;
import model.Papierosy;
import model.Sklep;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {
  public void wyswietl () {     // public dostepna dla wszystkich klas_moglaby byc niedostepna dla innej klasy,pakietu, privATE-DOSTEPNA tylko w tej klasie
                                // protected -dosteppna dla swoich dzieci __void wyswietl-dostepne tylko dla pakietu

      Sklep sklep = new Sklep("Alkohole w akademiku");

      System.out.println("1 - dodaj alkohol");
      System.out.println("2 - usun alkohol");
      System.out.println("3 - wyswietl liste");
      System.out.println("4 - dodaj papierosy");
      System.out.println("q - wyjscie");
      //TODO dodac nowe opcje

      Scanner wejscie = new Scanner(System.in);

      String wybor;
      String tak;



      do {
          System.out.println("Wybierz");
          wybor = wejscie.nextLine();
          if (wybor.equals("1")){                     //bo Stringow nie da sie porownywac za pomoca ==
              System.out.println("podaj nazwe");
             String nazwa = wejscie.nextLine();

              System.out.println("podaj cene");
              BigDecimal cena = wejscie.nextBigDecimal();
              wejscie.nextLine();                         //by enter nie zostal wczytany niepoprawnie

              System.out.println("podaj pojemnosc");
              String pojemnosc = wejscie.nextLine();

              System.out.println("podaj procent alkoholu");
              String procentAlkoholu = wejscie.nextLine();

              Alkohol alkohol = new Alkohol(nazwa,cena, pojemnosc, procentAlkoholu);
              sklep.dodajAlkohol(alkohol);  // dodanie do sklepu

          }
          else if (wybor.equals("2")){
              System.out.println("usun alkohol");
              System.out.println("Podaj id do usuniecia ");
              int id = wejscie.nextInt();
              wejscie.nextLine();
              sklep.usunAlkohol(id);
              System.out.println("usunieto alkohol z id: " + id);
          }
          else if (wybor.equals("3")){
              System.out.println("wyswietl liste");

              System.out.println(sklep);;
              System.out.println();
          }
          else if (wybor.equals("4")){                     //bo Stringow nie da sie porownywac za pomoca ==
              System.out.println("podaj nazwe papierosow");
              String nazwa = wejscie.nextLine();

              System.out.println("podaj cene");
              BigDecimal cena = wejscie.nextBigDecimal();
              wejscie.nextLine();                         //by enter nie zostal wczytany niepoprawnie

              System.out.println("podaj ilosc papierosow w paczce");
              int ilosc = wejscie.nextInt();

              System.out.println("podaj rodzaj");
              String rodzaj = wejscie.nextLine();

              Papierosy papieros = new Papierosy(nazwa, cena, ilosc, rodzaj);
              sklep.dodajPapierosy(papieros);  // dodanie do sklepu

          }
          else if (wybor.equals("q")){
              System.out.println("Koniec");
              break;
          }
          else {
              System.out.println("Wybrana opcja niepoprawna");
          }

      }
      while(!wybor.equals("q"));
  }
}
