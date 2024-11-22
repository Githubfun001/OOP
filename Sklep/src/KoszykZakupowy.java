import java.util.ArrayList;

public class KoszykZakupowy {
    private ArrayList<Product> _listaProduktów = new ArrayList<>();

    public KoszykZakupowy(ArrayList<Product> lista) {
        for(Product p : lista)
        {
            if(_listaProduktów.contains(p))
                p.addIloscWKoszyku(1);
            else {
                _listaProduktów.add(p);
                p.addIloscWKoszyku(1);
            }
        }
    }

    public void dodajProdukt(Product p, int ilosc) {
        if(p.getIloscNaMagazynie() > ilosc)
        {
            for(int i=0;i<ilosc;i++)
                _listaProduktów.add(p);
            p.usunZMagazynu(ilosc);
            p.addIloscWKoszyku(ilosc);
        }
    }

    public void wyswietlZawartoscKoszyka()
    {
        if(_listaProduktów.isEmpty())
            System.out.println("pusty");

        ArrayList<Product> temp = new ArrayList<>();
        for(Product p : _listaProduktów)
        {
            if(temp.contains(p))
                continue;
            System.out.println(p.getNazwa() +" : "+ p.getIloscWKoszyku());
            temp.add(p);
        }
    }

    public double obliczCalkowitaWartosc()
    {
        double wartosc = 0;
        for(Product p : _listaProduktów)
        {
            wartosc += p.getCena();
        }
        return wartosc;
    }
}
