import java.util.Objects;

public class Platnosc {
    double kwota;
    String statusPlatnosci;

    Platnosc(double kwota)
    {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieopłacone";
    }

    public void zaplac()
    {
        statusPlatnosci = "Opłacone";
        kwota = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platnosc platnosc = (Platnosc) o;
        return Double.compare(kwota, platnosc.kwota) == 0 && Objects.equals(statusPlatnosci, platnosc.statusPlatnosci);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kwota, statusPlatnosci);
    }
}
