package Collections;

import javax.swing.*;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> ListaPar = new HashMap<>();
        while (true) {
            int i = 0;
            System.out.println("Podaj Parę do listy:");
            String imie = sc.next();
            String imie1 = sc.next();
            if (imie.equals("-") || imie1.equals("-")) {
                break;
            } else {
                ListaPar.put(imie, imie1);
            }
        }
        System.out.println("Wprowadz uprzednio wprowadzone imie aby uzyskac pareę:");
        String szukaj = sc.next();
        if (ListaPar.containsKey(szukaj)){
                System.out.println(ListaPar.get(szukaj));
        }
    }
}
