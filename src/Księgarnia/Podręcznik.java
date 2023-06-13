package Księgarnia;

public class Podręcznik extends Książka{
    private String tytul;
    private String  autor;
    private String  opis;

    public Podręcznik(String gatunek, String wydawnictwo, int rokwydania, String tytul, String autor, String opis) {
        super(gatunek, wydawnictwo, rokwydania);
        if(tytul==null){
            throw new IllegalArgumentException("Nie podano tytułu");
        }else
            this.tytul = tytul;
        if(autor==null){
            throw new IllegalArgumentException("Nie podano autor");
        }else
            this.autor = autor;
        if(opis==null){
            throw new IllegalArgumentException("Nie podano opisu");
        }else
            this.opis = opis;
    }

    public Podręcznik() {
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public void opis() {
        System.out.println("\nAutor: "+autor+"\nTytuł: "+tytul+"\nOpis:\n"+opis);
        super.opis();
    }
}
