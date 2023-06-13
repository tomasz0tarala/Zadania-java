package Interfejsy_abstrakcja.Transport;

public class Main {
    public static void main(String[] args) {
        Samolot s1 = new Samolot();
        s1.fly();
        Statek st1 = new Statek();
        st1.swim();
        Obiekt kc = new Obiekt("kaczka");
        kc.fly();
        kc.swim();
    }

}
