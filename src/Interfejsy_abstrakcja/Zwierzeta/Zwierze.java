package Interfejsy_abstrakcja.Zwierzeta;

public abstract class Zwierze implements Latanie,Plywanie{
    private String name;

    public Zwierze(String name) {
        this.name = name;
    }

    public Zwierze() {
    }

    @Override
    public void lec() {
        System.out.println("Zwierzę leci");
    }

    @Override
    public void wyladuj() {
        System.out.println("Zwierzę wylądowało");
    }

    @Override
    public void plyn() {
        System.out.println("Zwierzę płynie");
    }

    @Override
    public void wynurz() {
        System.out.println("Zwierzę wynurza się");
    }

    @Override
    public void zanurz() {
        System.out.println("Zwierzę zanurza się");
    }
    public void wydala(){
        System.out.println("Zwierzę wydala");
    }
    public void jedz(){
        System.out.println("Zwierzę je");
    }

}
