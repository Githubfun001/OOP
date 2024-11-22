import java.util.ArrayList;

public class Zamowienie {
    private KoszykZakupowy _koszykZakupowy;
    private String _statusZamowienia;

    public Zamowienie(KoszykZakupowy koszyk) {
        _koszykZakupowy = koszyk;
        _statusZamowienia = "Zamowione";
    }

    public KoszykZakupowy getKoszykZakupowy() {
        return _koszykZakupowy;
    }

    public void ustawStatusZamowienia(String status) {
        _statusZamowienia = status;
    }

    public void wyswietlZamowienie() {
        _koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println(_statusZamowienia);
    }
}
