package ui_user_interface;

import io.PlikJson;
import io.PlikiBinarne;
import model.Alkohol;
import model.Papierosy;
import model.Sklep;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {
    public void wyswietl() {     // public dostepna dla wszystkich klas_moglaby byc niedostepna dla innej klasy,pakietu, privATE-DOSTEPNA tylko w tej klasie
        // protected -dosteppna dla swoich dzieci __void wyswietl-dostepne tylko dla pakietu

        Scanner wejscie = new Scanner(System.in);

        // Sklep sklep = new Sklep("Alkohole w akademiku");
      //  PlikiBinarne pliki = new PlikiBinarne();
        PlikJson pliki = new PlikJson();
        Sklep sklep;

        try {
            sklep = pliki.odczyt();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Nie udalo sie  wczytac sklepu");
             sklep = new Sklep("Alkohole w akademiku");
        }


        System.out.println("1 - dodaj alkohol");
        System.out.println("2 - usun alkohol");
        System.out.println("3 - wyswietl liste");
        System.out.println("4 - dodaj papierosy");
        System.out.println("q - wyjscie");
        //TODO dodac nowe opcje


        sklep.dodaj(new Alkohol("cytryna", BigDecimal.TEN, "0.7l", "40%"));
        sklep.dodaj(new Alkohol("kawa", BigDecimal.TEN, "0.75l", "45%"));
        sklep.dodaj(new Papierosy("malboro", new BigDecimal("20.5"), 20, "grube"));

        String wybor;
        String tak;


        do {
            System.out.println("Wybierz");
            wybor = wejscie.nextLine();
            if (wybor.equals("1")) {                     //bo Stringow nie da sie porownywac za pomoca ==
                System.out.println("podaj nazwe");
                String nazwa = wejscie.nextLine();

                System.out.println("podaj cene");
                BigDecimal cena = wejscie.nextBigDecimal();
                wejscie.nextLine();                         //by enter nie zostal wczytany niepoprawnie

                System.out.println("podaj pojemnosc");
                String pojemnosc = wejscie.nextLine();

                System.out.println("podaj procent alkoholu");
                String procentAlkoholu = wejscie.nextLine();

                Alkohol alkohol = new Alkohol(nazwa, cena, pojemnosc, procentAlkoholu);
                sklep.dodaj(alkohol);  // dodanie do sklepu

            } else if (wybor.equals("2")) {
                System.out.println("usun alkohol");
                System.out.println("Podaj id do usuniecia ");
                int id = wejscie.nextInt();
                wejscie.nextLine();
                sklep.usunAlkohol(id);
                System.out.println("usunieto alkohol z id: " + id);
            } else if (wybor.equals("3")) {
                System.out.println("wyswietl liste");

                System.out.println(sklep);
                ;
                System.out.println();
            } else if (wybor.equals("4")) {                     //bo Stringow nie da sie porownywac za pomoca ==
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
                sklep.dodaj(papieros);  // dodanie do sklepu

            } else if (wybor.equals("q")) {
                pliki.zapis(sklep);
                System.out.println("Koniec");

                break;

            } else {
                System.out.println("Wybrana opcja niepoprawna");
            }

        }
        while (!wybor.equals("q"));
    }
}


