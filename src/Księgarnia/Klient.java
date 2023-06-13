package Księgarnia;

public class Klient {
    private String imie;
    private String nazwisko;
    private String ulubionygatunek;
    private int wiek;
    Podręcznik ulubionaksiążka = new Podręcznik();

    public Klient(String imie, String nazwisko, String ulubionygatunek, int wiek,Podręcznik ulubionaksiążka) {
        if(imie==null){
            throw new IllegalArgumentException("Nie podano imienia");
        }else
            this.imie = imie;
        if(nazwisko==null){
            throw new IllegalArgumentException("Nie podano nazwiska");
        }else
            this.nazwisko = nazwisko;
        if(ulubionygatunek==null){
            throw new IllegalArgumentException("Nie podano ulubionego gatunku");
        }else
            this.ulubionygatunek = ulubionygatunek;
        if(wiek<0){
            throw new IllegalArgumentException(wiek+"źle podany rok wydania");
        }else
            this.wiek = wiek;
        if(ulubionaksiążka==null){
            throw new IllegalArgumentException("Nie podano gatunku");
        }else
            this.ulubionaksiążka = ulubionaksiążka;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getUlubionygatunek() {
        return ulubionygatunek;
    }

    public void setUlubionygatunek(String ulubionygatunek) {
        this.ulubionygatunek = ulubionygatunek;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Podręcznik getUlubionaksiążka() {
        return ulubionaksiążka;
    }

    public void setUlubionaksiążka(Podręcznik ulubionaksiążka) {
        this.ulubionaksiążka = ulubionaksiążka;
    }

    public void klientinfo(){
        System.out.println("\n\nImię:"+imie+"\nNazwisko: "+nazwisko+"\nUlubiony gatunek: "+ulubionygatunek+"\nUlubiona książka:"+getUlubionaksiążka().getTytul()+"\nOpis ulubionej książki:");
        ulubionaksiążka.opis();
    }
}
