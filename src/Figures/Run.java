package Figures;

import java.util.Scanner;

public class Run {
    public Run() {}
    public static void Close(){
        System.out.println("\t\t\tCzy na pewno chcesz wyjsc? t || T");
        Input in = new Input();
        String znak = in.InputString() ;
        String st1 ="t";
        String st2 ="T";
        if(znak.equals(st1) || znak.equals(st2)) System.exit(0);
    }
    public static void Error(){
        System.out.println("\t\t\tBłędne dane koniec programu.");
        System.exit(0);
    }
    public void startRun() {
        Input in = new Input();
        while (true) {
            Menu men = new Menu();
            men.showmenu();
            int wybor = in.IntINput() ;
            Square sq = new Square();
            Cube cub = new Cube();
            Rectangle rec = new Rectangle();
            Rectangular rectan = new Rectangular();
            Circle circ = new Circle();
            Sphere sph = new Sphere();
            Cone con = new Cone();
            switch (wybor) {
                case 1 -> {
                    sq.setInput();
                    sq.wypisz();
                }
                case 2 -> {
                    cub.setInput();
                    cub.wypisz();
                }
                case 3 -> {
                    rec.setInput();
                    rec.wypisz();
                }
                case 4 -> {
                    rectan.setInput();
                    rectan.wypisz();
                }
                case 5 -> {
                    circ.setInput();
                    circ.wypisz();
                }
                case 6 -> {
                    sph.setInput();
                    sph.wypisz();
                }
                case 7 -> {
                    con.setInput();
                    con.wypisz();
                }
                case 8 -> Close();
                default -> Error();
            }
        }
    }

}
