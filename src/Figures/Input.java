package Figures;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Input {
    public Input() {
    }
    public int IntINput(){
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        return liczba;
    }
    public  double InputDouble(){
        Scanner sc = new Scanner(System.in);
        double liczba = sc.nextDouble();
        return liczba;
    }
    public String InputString(){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        return string;
    }
}
