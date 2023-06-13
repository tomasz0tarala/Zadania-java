package Księgarnia;

public class Księgarnia {
    private String adres;
    private String nazwa;
    private int iloscpracownikow;
    Klient[] klienci=new Klient[5];

    public Księgarnia(String adres, String nazwa, int iloscpracownikow,Klient[] klienci) {
        if(klienci==null){
            throw new IllegalArgumentException("Nie podano klientów");
        }else
            this.klienci = klienci;
        if(adres==null){
            throw new IllegalArgumentException("Nie podano adresu");
        }else
            this.adres = adres;
        if(nazwa==null){
            throw new IllegalArgumentException("Nie podano nazwy księgarni");
        }else
            this.nazwa = nazwa;
        if(iloscpracownikow<0){
            throw new IllegalArgumentException(iloscpracownikow+"źle podana ilość pracowników");
        }else
        this.iloscpracownikow = iloscpracownikow;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIloscpracownikow() {
        return iloscpracownikow;
    }

    public void setIloscpracownikow(int iloscpracownikow) {
        this.iloscpracownikow = iloscpracownikow;
    }

    public Klient getKlient(int indeks) {
        return klienci[indeks];
    }

    public void setKlient(Klient[] klienci) {
        this.klienci = klienci;
    }
    public void księgarniainfo(){

    }
}
