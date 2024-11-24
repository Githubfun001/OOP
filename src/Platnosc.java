public class Platnosc {
    double kwota;
    String statusPlatnosci;

    Platnosc(double kwota, String statusPlatnosci)
    {
        this.kwota = kwota;
        this.statusPlatnosci = statusPlatnosci;
    }

    public void zaplac()
    {
        statusPlatnosci = "Opłacone";
        kwota = 0;
    }
}
