package Interfejsy_abstrakcja.Transport;

public class Samolot implements Fly{
    @Override
    public void fly() {
        System.out.println("Samolot lata");
    }

    public Samolot() {
    }
}
