package Figures;

import java.util.Scanner;

//kwadrat
public class Square {
// pola-----------------------------------------------
    private double a;
    String name;

    //konstruktor----------------------------------------

    public Square() {
    }
    public Square(double a, String name) {
        this.a = a;
        this.name = name;
    }
//getery,settery----------------------------------
    public double getA() {
        return a;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setA(double a) {
        this.a = a;
    }
//metody--------------------------------------------------
    public void setInput(){
        Input in = new Input();
        System.out.println("\t\t\tPodaj nazwę kwadratu: ");
        setName(in.InputString());
        System.out.println("\t\t\tPodaj długość boku kwadratu: ");
        setA(in.InputDouble());
    }

    public double obwod(double a){return 4*a;};
    public double pole(double a){return Math.pow(a,2);};

    public void wypisz(){
        System.out.format("\t\t\tFigura kwadrat o nazwie: %s, o długości boku: %.2f, pole: %.2f,"+" obowód: %.2f\n\n", name, a ,pole(a),obwod(a));
    }
}
