import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien;
    Adres adres;

    public Klient(String imie, String nazwisko, Adres adres)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = new ArrayList<>();
        this.adres = adres;
    }

    public void dodajZamowiene(Zamowienie z)
    {
        listaZamowien.add(z);
    }

    @Override
    public String toString() {
        return listaZamowien.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klient klient = (Klient) o;
        return Objects.equals(imie, klient.imie) && Objects.equals(nazwisko, klient.nazwisko) && Objects.equals(adres, klient.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, adres);
    }

    public double obliczLacznyKosztZamowien()
    {
        double wartosc = 0;
        for(Zamowienie z : listaZamowien){
            wartosc += z.koszykZakupowy.obliczCalkowitaWartosc();
        }
        return wartosc;
    }
}