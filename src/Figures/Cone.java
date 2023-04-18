package Figures;

import java.util.Scanner;

//stozek
public class Cone {
// pola-----------------------------------------------
    private double r,h;
    private double l=Math.hypot(h,r);
    String name;
//konstruktor----------------------------------------

    public Cone() {
    }

    public Cone(double r, double h, double l, String name) {
        this.r = r;
        this.h = h;
        this.l = l;
        this.name = name;
    }

    //getery,settery----------------------------------
    public double getL() {
        return l;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
//    metody--------------------------------------------------
    public void setInput(){
        Input in = new Input();
        System.out.println("\t\t\tPodaj nazwę Stożka: ");
        setName(in.InputString());
        System.out.println("\t\t\tPodaj wysokośc Stożka: ");
        setH(in.InputDouble());
        System.out.println("\t\t\tPodaj promien podstwy Stożka: ");
        setR(in.InputDouble());
        l=Math.hypot(h,r);
    }
    public double pole(double r,double l){return (Math.PI*Math.pow(r,2))+(Math.PI*r*l);}
    public double objetosc(double r, double h){return (Math.PI*Math.pow(r,2)*h)/3;}
    public void wypisz(){
        System.out.format("\t\t\tFigura stożek o nazwie: %s, promien: %.2f, wysokośc %.2f, długość krawędzi bocznej: %.2f pole: %.2f,"+" objetość: %.2f\n\n", name, r ,h, l, pole(r,l),objetosc(r,h));
    }
}
