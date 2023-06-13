package Collections;

import java.util.Objects;

public class Zad3 {
    String polecenie;
    int numer;
    double punktacja;

    public Zad3(String polecenie, int numer, double punktacja) {
        this.polecenie = polecenie;
        this.numer = numer;
        this.punktacja = punktacja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zad3 zad3 = (Zad3) o;

        if (numer != zad3.numer) return false;
        if (Double.compare(zad3.punktacja, punktacja) != 0) return false;
        return Objects.equals(polecenie, zad3.polecenie);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = polecenie != null ? polecenie.hashCode() : 0;
        result = 31 * result + numer;
        temp = Double.doubleToLongBits(punktacja);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Zadanie{" +
                "polecenie='" + polecenie + '\'' +
                ", numer=" + numer +
                ", punktacja=" + punktacja +
                '}';
    }
}
