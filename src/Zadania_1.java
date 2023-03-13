import java.util.Random;
import java.util.Scanner;

public class Zadania_1 {
    public static void main(String[] args) {
        dzialania();
        System.out.println(czyparzysta(4));
        System.out.println(podzielnaprzez3i5(4));
        System.out.println(pow3(2));
        System.out.println(pierwiastek(5.3));
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe przedzialu: ");
        int o = sc.nextInt();
        System.out.println("Podaj druga liczbe przedzialu: ");
        int p = sc.nextInt();
        Random rand = new Random();
        int a= rand.nextInt(p-o+1)+o;
        int b= rand.nextInt(p-o+1)+o;
        int c= rand.nextInt(p-o+1)+o;
        System.out.println(trojkatprost(a,b,c));
    }
    public static void dzialania(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        double a=sc.nextDouble();
        System.out.println("Podaj druga liczbe: ");
        double b= sc.nextDouble();
        System.out.format("Suma %f + %f = %f",a,b,(a+b));
        System.out.format("\nRóżnica %f - %f = %f",a,b,(a-b));
        System.out.format("\nRóżnica %f * %f = %f\n",a,b,(a*b));
    }
    public static boolean czyparzysta(int x){
        if(x%2==0){
            return true;
        }
        return false;
    }
    public static  boolean podzielnaprzez3i5(int y){
        if(y%3==0 && y%5==0){
            return true;
        }
        return false;
    }
    public static double pow3(double b){
        return Math.pow(b,3);
    }
    public static double pierwiastek(double q){
        return Math.sqrt(q);
    }
    public static boolean trojkatprost(int a, int b, int c){
        if(a>=b && a>=c) {
            if(Math.pow(c,2)+Math.pow(b,2)==Math.pow(a,2)){
                return true;
            }
            return false;
        }else if(b>=a && b>=c){
            if(Math.pow(c,2)+Math.pow(a,2)==Math.pow(b,2)){
                return true;
            }
            return false;
        }else {
            if(Math.pow(b,2)+Math.pow(a,2)==Math.pow(c,2)){
                return true;
            }
            return false;
        }

    }

}
