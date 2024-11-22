import java.util.ArrayList;

public class Sklep {
    private ArrayList<Product> _produkty = new ArrayList<>();

    public Sklep(ArrayList<Product> produkty) {
        _produkty = produkty;
    }

    public void dodajProdukt(Product p, int count) {
        for(int i = 0; i < count; i++)
            _produkty.add(p);
    }

    public void wyswietlOferty()
    {
        System.out.println("Wyposażenie sklepu:");
        for(Product p : _produkty)
            System.out.println(p.getNazwa() + " " + p.getCena());
    }
}
