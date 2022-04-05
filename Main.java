import java.util.Scanner;
import java.lang.*;
import java.util.*;


class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Witaj w programie, Wybierz funkcję:");
  System.out.println("1) Zamiana liter");
  System.out.println("2) Kopiowanie znak po znaku");
  System.out.println("3) Liczenie znaków w tablicy");
  System.out.println("4) Zamiana spacji na podkreślenia");
  int s = scan.nextInt();
    switch(s){
      case 1:
        System.out.println("1) Zamiana małych liter na duże: ");
        System.out.println("2) Zamiana dużych liter na małe: ");
            int z = scan.nextInt();
        
            System.out.println("Wprowadz dowolny tekst:");
            scan.nextLine();
            String tekst = scan.nextLine();
            int dlugosc = tekst.length();
            char tab[]=new char[dlugosc];
        
            for (int i=0; i<dlugosc; i++){
            tab[i]=tekst.charAt(i);
            }
        
            int zmienione = 0;
              
           for(int i=0;i<dlugosc;i++){
              if(Character.isLowerCase(tab[i])){
              if(z==1){
                tab[i]= Character.toUpperCase(tab[i]);
                zmienione++;
                System.out.print(tab[i]);
                }else{System.out.print(tab[i]);
                }
                }else{
                if(z==2){
                tab[i]= Character.toLowerCase(tab[i]);
                zmienione++;
               System.out.print(tab[i]);
              } else{
                System.out.print(tab[i]);
              }
              
          }
          
        } 
        System.out.println();
        System.out.println("Liczba zamienionych liter:  "+zmienione);
    
        break;
        
      case 2:
      System.out.println("Wprowadzaj kolejne znaki, aby zakończyć wciśnij \"Q\"");
      
     List<String> list= new ArrayList<>();
        
      String znak = "";
      boolean warunek = false;
      while(warunek != true ){
        list.add(znak);
        znak=scan.nextLine();
        if(znak.equals("Q")||znak.equals("q")){warunek = true;}
        //warunek = znak.equals("Q");
        
        
        }
        System.out.println("koniec");

        for (String elementy : list) {
        System.out.print(elementy);
        }
  
      break;
        
    case 3:
        System.out.println("Liczenie znaków tablicy, zadeklaruj liczbę elementów.");
        int dlu = scan.nextInt();
        System.out.println("Wprowadź elementy tablicy oddzielone enterami");

        int dlug= dlu+1;
        String tablica[]=new String[dlug];
        // String element = "";
        for(int i=0;i<dlug;i++){
          String element=scan.nextLine();
          tablica[i]= element;
        }
        int suma = 0;
         for(int i=0; i<dlug; i++){
          int wielkosc=tablica[i].length();
           suma = suma+wielkosc;
        } 
        System.out.println("Ilość znaków w tablicy to: "+suma);
        //         for(int i=0; i<dlug; i++){
        //   System.out.print(tablica[i]);
        // } 
        
    break;
      case 4:
        System.out.println("Wprowadź dowolny tekst oddzielony spacjami");
        scan.nextLine();
        String zdanie=scan.nextLine();
        int dl= zdanie.length();
        char tabl[] = new char[dl];
       for(int i=0;i<dl;i++){
         tabl[i]=zdanie.charAt(i);
       }
        
        for(int i=0;i<dl;i++){
          
          if (tabl[i] == ' '){
            tabl[i] = '_';
          }else{
            tabl[i]=tabl[i];
          }
        }
        System.out.println("Twoje zamienione zdanie to: ");
        for(int i=0; i<dl; i++){
          System.out.print(tabl[i]);
        }
        break;
      
    }
  }
 }