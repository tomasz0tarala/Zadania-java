import java.util.Date;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Run();
    }
    public static void Menu(){
        System.out.println("\n\t\t\t======================");
        System.out.println("\t\t\t======Kalkulator======");
        System.out.println("\t\t\t======================");
        System.out.println("\n\t\t\t1. Suma"+"\n\t\t\t2. Różnica"+"\n\t\t\t3. Iloczyn"+"\n\t\t\t4. Iloraz"+"\n\t\t\t5. Pierwiastek"+"\n\t\t\t6. Potęga"+"\n\t\t\t7. Funkcje trygonometryczne (sin, cos, tg, ctg)"+"\n\t\t\t8. Wyjście");
        System.out.println("\t\t\t-----------------------------------------------");
        System.out.println("\t\t\tWybierz opcje: ");
    }
    public static int InputInt(){
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        return liczba;
    }
    public static String InputString(){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        return string;
    }
    public static void Run(){
        int wybor;
        while(true){
            Menu();
            wybor=InputInt();
            switch (wybor){
                case 1 ->Suma();
                case 2 ->Różnica();
                case 3 ->Iloczyn();
                case 4 ->Iloraz();
                case 5 ->Potega();
                case 6 ->Pierwiastek();
                case 7 ->FunkcjeT();
                case 8 ->Close();
                default->Error();
            }
        }
    }
    public static void Suma(){
        System.out.println("\t\t\tWprowadź pierwszą liczbę dzialania: ");
        int a = InputInt();
        System.out.println("\t\t\tWprowadź drugą liczbę dzialania: ");
        int b = InputInt();
        System.out.println("\n\t\t\t"+a+" + "+b+" = "+(a+b));
    }
    public static void Różnica(){
        System.out.println("\t\t\tWprowadź pierwszą liczbę dzialania: ");
        int a = InputInt();
        System.out.println("\t\t\tWprowadź drugą liczbę dzialania: ");
        int b = InputInt();
        System.out.println("\n\t\t\t"+a+" - "+b+" = "+(a-b));
    }
    public static void Iloczyn(){
        System.out.println("\t\t\tWprowadź pierwszą liczbę dzialania: ");
        int a = InputInt();
        System.out.println("\t\t\tWprowadź drugą liczbę dzialania: ");
        int b = InputInt();
        System.out.println("\n\t\t\t"+a+" * "+b+" = "+(a*b));
    }
    public static void Iloraz(){
        System.out.println("\t\t\tWprowadź pierwszą liczbę dzialania: ");
        int a = InputInt();
        System.out.println("\t\t\tWprowadź drugą liczbę dzialania: ");
        int b = InputInt();
        System.out.println("\n\t\t\t"+a+" / "+b+" = "+(a/b));
    }
    public static void Potega(){
        System.out.println("\t\t\tWprowadź podstawe potęgi: ");
        int a = InputInt();
        System.out.println("\t\t\tWprowadź wykladnik potęgi: ");
        int b = InputInt();
        System.out.println("\n\t\t\tPotega "+a+" stopnia "+b+" wynosi: "+(Math.pow(a,b)));
    }
    public static void Pierwiastek(){
        System.out.println("\t\t\tWprowadź liczbe pierwiastkowaną: ");
        int a = InputInt();
        System.out.println("\n\t\t\tPierwiastek z "+a+" = "+(Math.sqrt(a)));
    }
    public static void FunkcjeT(){
        System.out.println("\t\t\tWprowadź kąt w mierze łukowej: ");
        Scanner sc1 = new Scanner(System.in);
        double a = sc1.nextDouble();
        double b = Math.toDegrees(a);
        System.out.println("\n\t\t\tSinus: "+(Math.sin(b))+"\n\t\t\tCosinus: "+(Math.cos(b))+"\n\t\t\tTangens: "+(Math.tan(b))+"\n\t\t\tCotangens: "+(1/(Math.tan(b))));
    }
    public static void Close(){
        System.out.println("\t\t\tCzy na pewno chcesz wyjsc? t || T");
        String znak = InputString();
        String st1 ="t";
        String st2 ="T";
        if(znak.equals(st1) || znak.equals(st2)) System.exit(0);
    }
    public static void Error(){
        System.out.println("\t\t\tBłędne dane koniec programu.");
        System.exit(0);
    }
}
