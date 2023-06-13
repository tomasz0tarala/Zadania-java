package Interfejsy_abstrakcja;

public class Car implements  Moveable{
    private String marka;

    public Car(String marka) {
        this.marka = marka;
    }

    @Override
    public void start() {
        System.out.println("Samochód marki: "+marka+" rusza");
    }

    @Override
    public void stop() {
        System.out.println("Samochód marki: "+marka+" zatrzymał się");
    }
}
