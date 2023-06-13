package Interfejsy_abstrakcja.Transport;

public class Statek implements Swims{
    public Statek() {
    }

    @Override
    public void swim() {
        System.out.println("Statek płynie");
    }
}
