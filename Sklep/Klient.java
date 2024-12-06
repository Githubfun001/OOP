import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Klient {
    private String imie;
    private String nazwisko;
    private ArrayList<Zamowienie> listaZamowien;
    private Adres adres;

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
            wartosc += z.getKoszykZakupowy().obliczCalkowitaWartosc();
        }
        return wartosc;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie == null || imie.trim().isEmpty())
            throw new IllegalArgumentException();
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if(nazwisko == null || nazwisko.trim().isEmpty())
            throw new IllegalArgumentException();
        this.nazwisko = nazwisko;
    }

    public ArrayList<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public void setListaZamowien(ArrayList<Zamowienie> listaZamowien) {
        if(listaZamowien == null)
            throw new IllegalArgumentException();
        this.listaZamowien = listaZamowien;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        if(adres == null)
            throw new IllegalArgumentException();
        this.adres = adres;
    }
}