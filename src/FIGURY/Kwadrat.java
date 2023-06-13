package FIGURY;

public class Kwadrat extends Prostokat {
    public Kwadrat(String kolor, double wys, double szer) {
        super(kolor, wys, szer);
    }

    public Kwadrat(double wys, double szer, Punkt A, Punkt B, Punkt C, Punkt D) {
        super(wys, szer, A, B, C, D);
    }

    @Override
    public void przesun(float x, float y) {
        super.przesun(x, y);
    }

    @Override
    String opis() {
        return "Klasa Kwadrat. Kolor obiektu: "+kolor+" Wysokość kwadratu: "+wys+" Szerokość kwadratu: "+szer;
    }
}

