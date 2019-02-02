package ui_user_interface;

import java.util.Scanner;

public class Menu {
  public void wyswietl () {     // public dostepna dla wszystkich klas_moglaby byc niedostepna dla innej klasy,pakietu, privATE-DOSTEPNA tylko w tej klasie
                                // protected -dosteppna dla swoich dzieci __void wyswietl-dostepne tylko dla pakietu
      System.out.println("1 - dodaj alkohol");
      System.out.println("2 - usun alkohol");
      System.out.println("3 - wyswietl liste");
      System.out.println("q - wyjscie");

      Scanner wejscie = new Scanner(System.in);

      String wybor;
      String tak;



      do {
          System.out.println("Wybierz");
          wybor = wejscie.nextLine();
          if (wybor.equals("1")){                     //bo Stringow nie da sie porownywac za pomoca ==
              System.out.println("dodaj alkohol");
          }
          else if (wybor.equals("2")){
              System.out.println("usun alkohol");
          }
          else if (wybor.equals("3")){
              System.out.println("wyswietl liste");
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
