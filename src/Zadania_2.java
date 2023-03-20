import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class Zadania_2 {
    public static void main(String[] args) {
//        LiczbaPkt();
//        DodatnieiUjemne();
//        Ciag();
//        CiagLosowanie();
//        Palindrom();
//        Liczby_10();
//        NieWyswietlaj();
//        Nieskonczona();
//        SortowanieBabelkowe();
    }

    public static String InputString(){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        return string;
    }
    public static int InputInt(){
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        return liczba;
    }

    //   Zad.1------------------------------------------------------------------------
    public static void LiczbaPkt(){
        int i=0;
        System.out.println("Podaj liczbę studentów");
        int n = InputInt();
        int tabint[] = new int[n];
        for (i=0;i<n;i++){
            System.out.println("Podaj liczbę punktów studenta: ");
            tabint[i]=InputInt();
        }
        int suma=0;
        i=0;
        while(i<n){
            suma += tabint[i];
            i++;
        }
        System.out.println("Średnia liczba punktów: "+(suma/n));
    }

//  Zad.2--------------------------------------------------------------------------------------------------------

    public static void DodatnieiUjemne(){
        int i=0;
        int tab[]=new int[10];
        for (i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę do tablicy: ");
            tab[i]=InputInt();
        }
        int licznikujem=0, licznikdod=0;
        int sumaujem=0,sumadod=0;
        for (i = 0; i < 10 ; i++) {
            if(tab[i]>0) {
                licznikdod++;
                sumadod=sumadod+tab[i];
            }else if(tab[i]<0){
                licznikujem++;
                sumaujem=sumaujem+tab[i];
            }
        }
        System.out.println("Ilość liczb dodatnich: "+licznikdod+" Suma liczb dodatnich: "+sumadod);
        System.out.println("Ilość liczb ujemnych: "+licznikujem+" Suma liczb ujemnych: "+sumaujem);
    }

    //  Zad.3-----------------------------------------------------------------------------------------------

    public static void Ciag(){
        System.out.println("Podaj ostatnia liczbe ciagu: ");
        int n= InputInt();
        int i = 0;
        int sumaparzystych=0;
        while(i<=n){
            if(i%2==0){
                sumaparzystych=sumaparzystych+i;
            }
            i++;
        }
        System.out.println("Suma liczb parzystych ciągu: "+sumaparzystych);
    }

//    Zad.4-------------------------------------------------------

    public static void CiagLosowanie(){
        Random rand = new Random();
        System.out.println("Podaj liczbę losowań: ");
        int n = InputInt();
        int tab[]=new int[n];
        for (int i = 0; i < n; i++) {
            tab[i]=rand.nextInt(45-(-10)+1)-10;
        }
        int liczbaparzystych=0;
        for (int i = 0; i < n ; i++) {
            if(tab[i]%2==0){
                liczbaparzystych=liczbaparzystych+tab[i];
            }
        }
        System.out.println("Suma liczb parzystych z ciągu: "+liczbaparzystych);
    }

    //  Zad.5----------------------------------------------------------------------------

    public static void Palindrom(){
        System.out.println("Podaj słowo do sprawdzenia: ");
        String czypalindrom = InputString();
        boolean warunek = true;
        for(int i = 0;i<(czypalindrom.length()/2);i++){
            char currentChar = czypalindrom.charAt(i);
            char otherChar = czypalindrom.charAt((czypalindrom.length()-i-1));
            if (currentChar != otherChar){
                warunek=false;
                System.out.println("Nie jest palindromem");
                break;
            }
        }
        if(warunek)System.out.println("Jest palindromem");
    }

    //  Zad.6

    public static void Liczby_10(){
        int tab[] = new int[10];
        int iloczyn=1,suma=0,max=0,min=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę do tablicy: ");
            tab[i]=InputInt();
        }
        for (int i = 0; i < 10; i++) {
            if(tab[i]>max){
                max=tab[i];
            }
            if(tab[i]<max){
                min=tab[i];
            }
            suma += tab[i];
            iloczyn *= tab[i];
        }
        System.out.println("Suma: "+suma+"\nIloczyn: "+iloczyn+"\nWartośc średnia: "+(suma/10)+"\nMax: "+max+"\nMin: "+min);
    }

//    Zad.7---------------------------------------------------------------------------

    public static void NieWyswietlaj() {
        for (int i = 1; i <= 20; i++) {
            if(i==2 || i==6 || i==9 || i==15 || i==19){
                continue;
            }
            System.out.println(i);
        }
    }

//    Zad.8-----------------------------------------------------------------------------

    public static void Nieskonczona(){
        while(true){
            System.out.println("Podaj liczbę całkowitą, aby wyjść podaj liczbę ujemną ");
            if(InputInt()<0){
                System.exit(0);
                break;
            }
        }
    }

//    Zad.9-------------------------------------------------------------------------------

    public static void SortowanieBabelkowe(){
        System.out.println("Podaj rozmiar tablicy: ");
        int n = InputInt();
        int tab[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbę do tablicy");
            tab[i]=InputInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (tab[j] > tab[j+1]) {
                    int temp= tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=temp;
                }
            }
        }
        System.out.println("Posortowana tablica: ");
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i]+" ");
        }
    }
}
