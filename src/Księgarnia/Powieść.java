package Księgarnia;

public class Powieść extends Podręcznik{
    public Powieść(String gatunek, String wydawnictwo, int rokwydania, String tytul, String autor, String opis) {
        super(gatunek, wydawnictwo, rokwydania, tytul, autor, opis);
    }

    @Override
    public void opis() {
        super.opis();
    }
}
