import java.util.ArrayList;

public class Klient {
    private String _imie;
    private String _nazwisko;
    private ArrayList<Zamowienie> _listaZamowien;

    public Klient(String imie, String nazwisko){
        _imie = imie;
        _nazwisko = nazwisko;
        _listaZamowien = new ArrayList<>();
    }

    public void dodajZamowiene(Zamowienie z){
        _listaZamowien.add(z);
    }

    public void wyswietlHistorieZamowien(){
        for(Zamowienie z : _listaZamowien){
            z.wyswietlZamowienie();
            System.out.println();
        }
    }

    public double obliczLacznyKosztZamowien(){
        double wartosc = 0;
        for(Zamowienie z : _listaZamowien){
            KoszykZakupowy temp = z.getKoszykZakupowy();
            wartosc += temp.obliczCalkowitaWartosc();
        }
        return wartosc;
    }
}
