package Interfejsy_abstrakcja.Zwierzeta;

public abstract class Ryba extends Zwierze implements Plywanie,Latanie {
    @Override
    public void plyn() {
        System.out.println("Ryba płynie");
    }

    @Override
    public void wydala() {
        System.out.println("Ryba wydala");
    }

    @Override
    public void jedz() {
        System.out.println("Ryba je");
    }

    @Override
    public void wynurz() {
        System.out.println("Ryba się wynurza");
    }

    @Override
    public void zanurz() {
        System.out.println("Ryba się zanurza");
    }
}
