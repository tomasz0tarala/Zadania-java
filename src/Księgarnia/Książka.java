package Księgarnia;

public class Książka {
    private String gatunek;
    private String wydawnictwo;
    private int rokwydania;


    public Książka(String gatunek, String wydawnictwo, int rokwydania) {
        if(gatunek==null){
            throw new IllegalArgumentException("Nie podano gatunku");
        }else
            this.gatunek = gatunek;
        if(wydawnictwo==null){
            throw new IllegalArgumentException("Nie podano wyadawnictwa");
        }else
            this.wydawnictwo = wydawnictwo;
        if(rokwydania<0){
            throw new IllegalArgumentException(rokwydania+"źle podany rok wydania");
        }else
            this.rokwydania = rokwydania;
    }

    public Książka() {}

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public int getRokwydania() {
        return rokwydania;
    }

    public void setRokwydania(int rokwydania) {
        this.rokwydania = rokwydania;
    }
    public void opis(){
        System.out.println("Gatunek książki: "+gatunek+" wydana przez wydawnictwo: "+wydawnictwo+" w roku: "+rokwydania);
    }
}
