import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = new ArrayList<>();
    }

    public void dodajZamowiene(Zamowienie z)
    {
        listaZamowien.add(z);
    }

    public void wyswietlHistorieZamowien()
    {
        for(Zamowienie z : listaZamowien){
            z.wyswietlZamowienie();
            System.out.println();
        }
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