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
}
