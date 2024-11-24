import java.util.Map;

public class Zamowienie {
    KoszykZakupowy koszykZakupowy;
    String statusZamowienia;
    Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy)
    {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = "Zamówione";
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc(), "Nieopłacone");
    }

    public void ustawStatusZamowienia(String status)
    {
        statusZamowienia = status;
    }

    public void wyswietlZamowienie()
    {
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.print("Status: ");
        System.out.println(statusZamowienia);
    }

    public void finalizujZamowienie()
    {
        if(platnosc.statusPlatnosci.equalsIgnoreCase("Opłacone"))
            this.ustawStatusZamowienia("Gotowe do wysyłki");
    }

    public void zwrocProdukt(Produkt p, int ilosc)
    {
        p.dodajDoMagazynu(ilosc);
        for(Map.Entry<Produkt, Integer> entry : koszykZakupowy.listaProduktow.entrySet())
        {
            if(p == entry.getKey())
            {
                if(ilosc<entry.getValue())
                {
                    koszykZakupowy.listaProduktow.put(entry.getKey(), entry.getValue()-ilosc);
                }
                else
                    koszykZakupowy.listaProduktow.remove(entry.getKey());
            }
        }
    }
}