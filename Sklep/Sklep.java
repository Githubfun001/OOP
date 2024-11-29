import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class Sklep {
    ArrayList<Produkt> produkty;
    String nazwaSklepu;
    Date dataPowstania;
    Magazyn magazynSklepu;

    public Sklep(String nazwaSklepu, Date dataPowstania, Magazyn magazynSklepu)
    {
        Date currentDate = new Date();
        if(!dataPowstania.after(currentDate))
            throw new IllegalArgumentException();
        this.produkty = new ArrayList<>();
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
        this.magazynSklepu = magazynSklepu;
    }

    public void dodajProdukt(Produkt p)
    {
        if(!produkty.contains(p))
            produkty.add(p);
    }

    @Override
    public String toString()
    {
        return produkty.stream().map(Produkt -> Produkt.nazwa).collect(Collectors.joining("\n"));
    }

    public void wyszukajProduktu(String nazwa)
    {
        for(Produkt p : produkty){
            if (nazwa.equalsIgnoreCase(p.nazwa)) {
                System.out.println(p);;
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