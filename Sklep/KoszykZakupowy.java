import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KoszykZakupowy {
    Map<Produkt, Integer> listaProduktow;

    public KoszykZakupowy()
    {
        this.listaProduktow = new HashMap<>();
    }

    public void dodajProdukt(Produkt p, int ilosc)
    {
        if (p.iloscNaMagazynie >= ilosc)
        {
            listaProduktow.put(p, listaProduktow.getOrDefault(p, 0) + ilosc);
            p.usunZMagazynu(ilosc);
        }
    }

    @Override
    public String toString() {
        return listaProduktow.entrySet().stream()
                .map(entry -> entry.getKey().nazwa + " : " + entry.getValue())
                .collect(Collectors.joining("\n"));
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
