import java.util.HashMap;
import java.util.Map;

public class Sklep {
    HashMap<Produkt, Integer> produkty;

    public Sklep(HashMap<Produkt, Integer> produkty)
    {
        this.produkty = produkty;
    }

    public void dodajProdukt(Produkt p)
    {
            produkty.put(p, p.iloscNaMagazynie);
    }

    public void wyswietlOferty()
    {
        System.out.println("Wyposażenie sklepu:");
        produkty.forEach((produkt, ilosc) -> System.out.print(produkt.nazwa+ ", "));
        System.out.println();
    }

    public void wyszukajProduktu(String nazwa)
    {
        for(Map.Entry<Produkt, Integer> entry : produkty.entrySet())
        {
            if(entry.getKey().nazwa.equalsIgnoreCase(nazwa))
            {
                entry.getKey().wyswietlInformacje();
                return;
            }
        }
    }

    public void zakupy(KoszykZakupowy k, Produkt p, int ilosc)
    {
        if (p.iloscNaMagazynie >= ilosc)
            k.dodajProdukt(p, ilosc);
    }
}