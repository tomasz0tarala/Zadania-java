public class Okrag extends Figura implements RuchFigury{
    int r;
    int pole;
    Punkt srodek;

    public Okrag(int r, int pole, Punkt srodek) {
        this.r = r;
        this.pole = pole;
        this.srodek = srodek;
    }

    public Okrag(String kolor, int r, int pole, Punkt srodek) {
        super(kolor);
        this.r = r;
        this.pole = pole;
        this.srodek = srodek;
    }


    @Override
    public void przesun(int x, int y) {
        srodek.x=srodek.x+x;
        srodek.y=srodek.y+y;
    }

    @Override
    void skaluj(float skala) {
           pole=(int)(Math.PI*Math.pow(r,2))*((int)skala);
    }


}
