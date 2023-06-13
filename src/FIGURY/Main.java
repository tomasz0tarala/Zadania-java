package FIGURY;

public class Main {
    public static void main(String[] args) {
        Punkt pt1 = new Punkt(1,2);
        Punkt pt2 = new Punkt(-3,7);
        Punkt pt3 = new Punkt(2,6);
        pt1.opis();
        pt1.przesun(2,3);
        pt1.opis();
        pt1.zeruj();
        pt1.opis();
        Kwadrat kw = new Kwadrat("blue",5,6);
        System.out.println(kw.opis());
        kw.przesun(2,4);
    }
}
