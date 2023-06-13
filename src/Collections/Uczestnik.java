package Collections;

public class Uczestnik {
    int ID;
    String imie;
    int wiek;

    public Uczestnik(int ID, String imie, int wiek) {
        this.ID = ID;
        this.imie = imie;
        this.wiek = wiek;
    }

    public Uczestnik() {
    }


    @Override
    public String toString() {
        return "{" +
                "ID=" + ID +
                ", imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Uczestnik uczestnik = (Uczestnik) o;

        if (ID != uczestnik.ID) return false;
        if (wiek != uczestnik.wiek) return false;
        return imie.equals(uczestnik.imie);
    }

    @Override
    public int hashCode() {
        int result = ID;
        result = 31 * result + imie.hashCode();
        result = 31 * result + wiek;
        return result;
    }
//==============================================================
}
