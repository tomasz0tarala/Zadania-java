package Exception.Zadania_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WprowadzZKonsoli {
    Scanner sc =new Scanner(System.in);
    public  void wprowadzInt(){

            try {
                sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Należy podać liczbę całkowitą");
                sc.next();
            }

    }

}
