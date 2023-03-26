import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.parallelSort;

public class Zadania_3 {
    public static void main(String[] args) {
//        int[] tab = {1,24,5,5,6};
//        int[] tab1 = {2,1,24,5,5,6};
//        codrugielemnt(tab);
//        codrugielemnt(tab1);
//        System.out.println(sum(losowatablica()));
//        System.out.println(srednia(losowatablica()));
//        System.out.println(Arrays.toString(losowatablica()));
//        tablicaToUpper();
//        tablicaOdwrócona();
//        sortowanietablicy();
//        SilniaTablicy();
//        PorównanieTablic();
    }
    public static String InputString(){
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        return string;
    }
    public static int RandomInput(){
        Random rand = new Random();
        return rand.nextInt(42)-42;
    }
    public static String[] tablicaString(int n){
        String[] tab = new String[n];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj łańcuh znaków do tablicy");
            tab[i]=InputString();
        }
        return tab;
    }
    public static int[] TabInt(int n){
        int tab[] = new int[n];
        for (int i = 0;i<n;i++) {
            System.out.println("Podaj liczbę do tablicy ");
            tab[i]=InputInt();
        }
        return tab;
    }
//   Zad_7=========================================
    public static void PorównanieTablic(){
        String tab1[]={"Ala","BAbaww","awera","we"};
        String tab2[]={"Ala","BAbaw","awera","we"};
        if(Arrays.equals(tab1,tab2)==true) {
            System.out.println("Tablice są identyczne");
        } else System.out.println("Tablice się różnią");
    }
//  Zad_6==========================================================
    public static void SilniaTablicy() {
        final int rozmiar = 5;
        int tab[] = TabInt(rozmiar);
        for (int i = 0; i < rozmiar; i++) {
            int sil = 1;
            for (int j = 1; j <= tab[i]; j++) {
                sil = sil * j;
            }
            tab[i] = sil;
            System.out.println(tab[i]);
        }
    }
//  Zad_5=====================================================
    public static void sortowanietablicy(){
        final int rozmiar=8;
        int tab[] = TabInt(rozmiar);
        Arrays.parallelSort(tab,0,tab.length);
        System.out.println(Arrays.toString(tab));
    }
    //Zad_4==============================================
    public static void tablicaOdwrócona(){
        String[] s = tablicaString(5);
        for (int i = 0; i < 5; i++) {
            char[] ch = s[i].toCharArray();
            String temp = " ";
            for (int j = ch.length-1 ; j >= 0 ; j--) {
                temp+=ch[j];
            }
            System.out.println(temp);
        }
    }
    //Zad_3=====================================================
    public static void tablicaToUpper(){
        String[] tab = {"ala","adam","kacper","adrian","ola"};
        for (String item:tab) {
            System.out.println(item.toUpperCase());
        }
    }
    //Zad_2===================================================================
    public static void codrugielemnt(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 1) {
                System.out.println(tab[i]);
            }
        }
    }
    //Zad_1=================================================
    public static float sum(int[] tab){
        float sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum+=tab[i];

        }
        return sum;
    }
    public static float srednia(int[] tab){
        float srednia = (sum(tab)/tab.length);
        return srednia;
    }
// ============================================================================
    public static int[] losowatablica() {
        final int rozmiar = 15;
        int[]array = new int[rozmiar];
        for (int i = 0; i < array.length; i++) {
            array[i] = RandomInput();
        }
        return array;
    }
    public static int InputInt() {
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        return liczba;
    }

}
