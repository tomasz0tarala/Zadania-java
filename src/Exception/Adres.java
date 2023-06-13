package Exception;

public class Adres {
    String ulica;
    String miasto;
    String kodpocztowy;
    int numerdomu;

    public Adres(String ulica, String miasto, String kodpocztowy, int numerdomu) throws NieprawidlowyAdresException{
            this.kodpocztowy = kodpocztowy;
            this.miasto = miasto;
            this.numerdomu = numerdomu;
            this.ulica = ulica;
    }
}
