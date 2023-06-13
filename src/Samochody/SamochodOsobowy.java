package Samochody;

public class SamochodOsobowy extends Samochod{
    private double Waga;
    private double PojemnośćSilinika;
    private int IlośćOsób;

    public SamochodOsobowy(String marka, String nadwozie, String kolor, int rokprodukcji, int przebieg, double waga, double pojemnośćSilinika, int ilośćOsób) {
        super(marka, nadwozie, kolor, rokprodukcji, przebieg);
        if(waga<2 || waga>4.5){
            throw new IllegalArgumentException(waga+" waga nie poprawna, waga musi zawierać się w przedziale od 2t do 4,5t.");
        }
        this.Waga = waga;
        if (pojemnośćSilinika<0.8 || pojemnośćSilinika>3){
            throw new IllegalArgumentException(pojemnośćSilinika+" nie poprawna pojemność silnika, musi zawierać się w przedziale od 0,8l do 3l");
        }
        this.PojemnośćSilinika = pojemnośćSilinika;
        if (ilośćOsób<0){
            throw new IllegalArgumentException(ilośćOsób+" nie poprawna liczba osób");
        }
        this.IlośćOsób = ilośćOsób;
    }

    public SamochodOsobowy(String marka, String nadwozie, String kolor, int rokprodukcji, int przebieg) {
        super(marka, nadwozie, kolor, rokprodukcji, przebieg);
    }

    public double getWaga() {
        return Waga;
    }

    public void setWaga(double waga) {
        Waga = waga;
    }

    public double getPojemnośćSilinika() {
        return PojemnośćSilinika;
    }

    public void setPojemnośćSilinika(double pojemnośćSilinika) {
        PojemnośćSilinika = pojemnośćSilinika;
    }

    public int getIlośćOsób() {
        return IlośćOsób;
    }

    public void setIlośćOsób(int ilośćOsób) {
        IlośćOsób = ilośćOsób;
    }

    @Override
    public void Opis() {
        System.out.println("\nSamochód jest marki: "+getMarka()+"\nTyp nadwozia samochodu: "+getNadwozie()+"\nKolor samochodu: "+getKolor()+"\nSamochód został wyprodukowany w roku: "+getRokprodukcji()+"\nSamochód posiada przebieg: "+getPrzebieg()+"km");
        System.out.println("\nWaga samochodu: "+getWaga()+"\nPojemność silnika: "+getPojemnośćSilinika()+"\nSamochód może pomieścić"+getIlośćOsób()+" osób");
    }
}
