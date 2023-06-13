package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ZAD.1
//        System.out.println("Podaj liczbę");
//        Scanner sc = new Scanner(System.in);
//        double userinput = 0;
//        while(true){
//            try{
//                userinput = sc.nextDouble();
//                break;
//            }catch (InputMismatchException e){
//                System.out.println("Podaj poprawna liczbe");
//                sc.next();
//            }
//        }
//        if(userinput<0){
//            throw new IllegalArgumentException(String.format("Pierwiastek z liczby"+"%.4f nie istnieje",userinput));
//        }
//        System.out.println("Wynik "+ Math.sqrt(userinput));

//        try{
//            System.out.println("-2! = "+ silnia(-2));
//            System.out.println("3! = "+ silnia(3));
//        }catch (Errorsilnia e){
//            System.out.println("Error !!! "+ e.getMessage());
//        }
    try{
        Adres ad2 = new Adres(null,null,null,-2);
    }catch (Exception e) {
        System.out.println("error " + e.getMessage());
    }

    }
//    public static int silnia(int n) throws Errorsilnia{
//        if(n<0){
//            throw new Errorsilnia("Silnia nie może być licznona z liczby ujemnej");
//        }
//        int wynik =1;
//        for (int i = 2; i <=n ; i++) {
//            wynik*=i;
//        }
//        return wynik;
//    }

}
