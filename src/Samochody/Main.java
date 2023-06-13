package Samochody;

public class Main {
    public static void main(String[] args) {
        SamochodOsobowy so = new SamochodOsobowy("Mercedes","SUV","czarny",2007,204500,2.5,2.8,6);
        Samochod s = new Samochod("Subaru","Coupe","czarny",2022,206);
        Samochod s1 = new Samochod();
        s.Opis();
        so.Opis();
        s1.Opis();
    }
}
