package Collections;

import javax.print.DocFlavor;
import javax.swing.*;
import java.util.*;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaLiczb = new LinkedList<>();
        listaLiczb.add(0,232);
        listaLiczb.add(1,732);
        listaLiczb.add(2,2);
        listaLiczb.add(3,2436);
        //        Zad3
//        Zad3 []zadniaTest = new Zad3[3];
//        Zad3 zadanie_1 = new Zad3("Oblicz pole kwadratu",1,3);
//        Zad3 zadanie_2 = new Zad3("Oblicz pole trojkata",2,3);
//        Zad3 zadanie_3 = new Zad3("Oblicz pole prostokata",3,5);
//        zadniaTest[0] = zadanie_1;
//        zadniaTest[1] = zadanie_2;
//        zadniaTest[2] = zadanie_3;
//        List<Zad3> listazadan = new ArrayList<>();
//        listazadan.add(0,zadniaTest[0]);
//        listazadan.add(1,zadniaTest[1]);
//        listazadan.add(2,zadniaTest[2]);
//        List<Zad3> podlista = listazadan.subList(0,1);
//        listazadan.remove(0);
//        listazadan.remove(1);
        /*     ArrayList<Uczestnik> listauczestnikcow = new ArrayList<>();
        LinkedList<Uczestnik> listauczestnikcow1 = new LinkedList<>();
        Uczestnik uczestnik1 = new Uczestnik(1243,"Ola",12);
        Uczestnik uczestnik2 = new Uczestnik(2222,"Majkel",22);
        Uczestnik uczestnik3 = new Uczestnik(6712,"Tomek",27);
        Uczestnik uczestnik4 = new Uczestnik(1890,"Ala",20);
        listauczestnikcow.add(0,uczestnik1);
        listauczestnikcow.add(1,uczestnik2);
        listauczestnikcow.add(2,uczestnik3);
        listauczestnikcow.add(3,uczestnik4);
//        filtruj18(listauczestnikcow);
        listauczestnikcow1.add(0,uczestnik1);
        listauczestnikcow1.add(1,uczestnik2);
        listauczestnikcow1.add(2,uczestnik3);
        listauczestnikcow1.add(3,uczestnik4);
        filtruj18(listauczestnikcow1);*/


    }
    public static void filtruj18(ArrayList<Uczestnik> a){
        for (Uczestnik b:a) {
            if(b.wiek<18){
                continue;
            }
            System.out.println(b.toString());
        }
    }
    public static void filtruj18(LinkedList<Uczestnik> a){
        for (Uczestnik b:a) {
            if(b.wiek<18){
                continue;
            }
            System.out.println(b.toString());
        }
    }
}
