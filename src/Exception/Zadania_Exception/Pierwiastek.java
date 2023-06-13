package Exception.Zadania_Exception;

import Figures.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pierwiastek {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę do spierwiastkowania");
        Scanner sc = new Scanner(System.in);
        double userinput;
        while (true) {
            try {
                userinput = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Podaj liczbę.");
                sc.next();
            }
        }
        if (userinput < 0) {
            throw new IllegalArgumentException(String.format("Pierwiastek z liczby" + "%.4f nie istnieje", userinput));
        }
        System.out.println("Wynik "+pierwiastek(userinput));
        WprowadzZKonsoli input = new WprowadzZKonsoli();
        input.wprowadzInt();
    }
    public static double pierwiastek(double a){
        return Math.sqrt(a);
    }
}
