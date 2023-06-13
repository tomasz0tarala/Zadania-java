package Samochody;

import java.util.Scanner;

public class Samochod {
    private String Marka;
    private String Nadwozie;
    private String Kolor;
    private int Rokprodukcji;
    private int Przebieg;

    public Samochod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj markę");
        this.Marka=sc.next();
        System.out.println("Podaj typ nadwozia:");
        this.Nadwozie=sc.next();
        System.out.println("Podaj kolor samochodu:");
        this.Kolor=sc.next();
        System.out.println("Podaj rok produkcji:");
        this.Rokprodukcji=sc.nextInt();
        System.out.println("Podaj przebieg samochodu:");
        this.Przebieg=sc.nextInt();

    }

    public Samochod(String marka, String nadwozie, String kolor, int rokprodukcji, int przebieg) {
        this.Marka = marka;
        this.Nadwozie = nadwozie;
        if (przebieg<0){
            throw new IllegalArgumentException(przebieg+" nie jest poprawnym przebiegiem");
        }
        this.Przebieg = przebieg;
        this.Kolor = kolor;
        this.Rokprodukcji = rokprodukcji;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public String getNadwozie() {
        return Nadwozie;
    }

    public void setNadwozie(String nadwozie) {
        Nadwozie = nadwozie;
    }

    public String getKolor() {
        return Kolor;
    }

    public void setKolor(String kolor) {
        Kolor = kolor;
    }

    public int getRokprodukcji() {
        return Rokprodukcji;
    }

    public void setRokprodukcji(int rokprodukcji) {
        Rokprodukcji = rokprodukcji;
    }

    public int getPrzebieg() {
        return Przebieg;
    }

    public void setPrzebieg(int przebieg) {
        Przebieg = przebieg;
    }
    public void Opis(){
        System.out.println("\nSamochód jest marki: "+getMarka()+"\nTyp nadwozia samochodu: "+getNadwozie()+"\nKolor samochodu: "+getKolor()+"\nSamochód został wyprodukowany w roku: "+getRokprodukcji()+"\nSamochód posiada przebieg: "+getPrzebieg()+"km");
    }
}
