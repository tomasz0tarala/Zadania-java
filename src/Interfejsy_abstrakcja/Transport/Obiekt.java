package Interfejsy_abstrakcja.Transport;

public class Obiekt implements Fly,Swims{
    private String name;

    public Obiekt(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("Obiekt "+name+" zaczął latać");
    }

    @Override
    public void swim() {
        System.out.println("Obiekt "+name+" zaczął pływać");
    }

    public Obiekt() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
