import java.util.HashMap;
import java.util.Map;

public class KoszykZakupowy {
    Map<Produkt, Integer> listaProduktow;

    public KoszykZakupowy()
    {
        listaProduktow = new HashMap<>();
    }

    public void dodajProdukt(Produkt p, int ilosc)
    {
        if (p.iloscNaMagazynie >= ilosc)
        {
            p.usunZMagazynu(ilosc);
            listaProduktow.put(p, ilosc);
        }
    }

    public void wyswietlZawartoscKoszyka()
    {
        System.out.println("Zwartosc koszyka:");
        if (listaProduktow.isEmpty())
            System.out.println("pusty");

        else
            listaProduktow.forEach((produkt, iloscWKoszyku) ->
                System.out.println("nazwa: " + produkt.nazwa+" | ilosc w koszyku: " + iloscWKoszyku)
            );
    }

    public double obliczCalkowitaWartosc()
    {
        double wartosc = 0;
        for(Map.Entry<Produkt, Integer> entry : listaProduktow.entrySet())
        {
            wartosc += entry.getKey().cena * entry.getValue();
        }
        return wartosc;
    }
}
