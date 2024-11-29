import java.util.Map;

public class Zamowienie {
    KoszykZakupowy koszykZakupowy;
    String statusZamowienia;
    Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy)
    {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = "Zamówione";
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());
    }

    public void ustawStatusZamowienia(String status)
    {
        statusZamowienia = status;
    }

    @Override
    public String toString() {
        return koszykZakupowy.toString()+ "\n" + "Status: " + statusZamowienia;
    }

    public void finalizujZamowienie()
    {
        if(platnosc.statusPlatnosci.equalsIgnoreCase("Opłacone"))
            this.ustawStatusZamowienia("Gotowe do wysyłki");
    }

    public void zwrocProdukt(Produkt p, int ilosc)
    {
        Integer iloscProduktu = koszykZakupowy.listaProduktow.get(p);
        if(iloscProduktu != null && ilosc > 0) {
            if (iloscProduktu > ilosc)
                koszykZakupowy.listaProduktow.put(p, iloscProduktu - ilosc);
            else
                koszykZakupowy.listaProduktow.remove(p);
            p.dodajDoMagazynu(ilosc);
        }
    }
}