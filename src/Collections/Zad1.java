package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ListaImion = new ArrayList<>();
        while(true){
            int i = 0;
            System.out.println("Podaj imię do listy:");
            String imie = sc.next();
            if(imie.equals("-")){
                break;
            }else {
                ListaImion.add(imie);
            }
        }
        HashSet<String> UnikalneImiona = new HashSet<>(ListaImion);
        for (String element:UnikalneImiona) {
            if(false==UnikalneImiona.stream().noneMatch(Predicate.isEqual(element))){
                System.out.println(element);
            }
        }
    }

}
