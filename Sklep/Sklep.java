import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sklep {
    ArrayList<Produkt> produkty;

    public Sklep()
    {
        this.produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt p)
    {
        if(!produkty.contains(p))
            produkty.add(p);
    }

    public void wyswietlOferty()
    {
        System.out.println("Wyposażenie sklepu:");
        produkty.forEach((produkt) -> System.out.print(produkt.nazwa+ ", "));
        System.out.println();
    }

    public void wyszukajProduktu(String nazwa)
    {
        for(Produkt p : produkty){
            if (nazwa.equalsIgnoreCase(p.nazwa)) {
                p.wyswietlInformacje();
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