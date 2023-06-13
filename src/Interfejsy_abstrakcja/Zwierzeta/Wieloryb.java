package Interfejsy_abstrakcja.Zwierzeta;

import java.util.zip.ZipOutputStream;

public class Wieloryb extends Ryba{
    public Wieloryb() {
    }

    @Override
    public void plyn() {
        System.out.println("Wieloryb pływa");
    }

    @Override
    public void wydala() {
        System.out.println("Wieloryb wydala");
    }

    @Override
    public void jedz() {
        System.out.println("Wieloryb je");
    }

    @Override
    public void wynurz() {
        System.out.println("Wieloryb wynurza się");
    }

    @Override
    public void zanurz() {
        System.out.println("Wieloryb zanurza się");
    }
}
