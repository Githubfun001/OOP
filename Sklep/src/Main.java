import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product krzesła = new Product("krzesło", 19.99, 7);
        Product stoły = new Product("stół", 25.00, 10);

        ArrayList<Product> listaZakupowa = new ArrayList<>();
        listaZakupowa.add(krzesła);
        listaZakupowa.add(krzesła);
        listaZakupowa.add(stoły);

        KoszykZakupowy koszyk = new KoszykZakupowy(listaZakupowa);

        koszyk.dodajProdukt(krzesła, 2);
        koszyk.dodajProdukt(stoły, 2);

        Zamowienie zamowienie = new Zamowienie(koszyk);
        zamowienie.ustawStatusZamowienia("Dostarczone");

        ArrayList<Product> listaZakupowa2 = new ArrayList<>();
        listaZakupowa2.add(krzesła);
        listaZakupowa2.add(krzesła);
        listaZakupowa2.add(krzesła);
        KoszykZakupowy koszyk2 = new KoszykZakupowy(listaZakupowa2);
        Zamowienie zamowienie2 = new Zamowienie(koszyk2);

        Klient klient = new Klient("Jan", "Kowalski");
        klient.dodajZamowiene(zamowienie);
        klient.dodajZamowiene(zamowienie2);
        klient.wyswietlHistorieZamowien();
        System.out.println("Łączny koszt: "+klient.obliczLacznyKosztZamowien());

        System.out.println();

        ArrayList<Product> wyposazenie = new ArrayList<>();
        wyposazenie.add(stoły);
        wyposazenie.add(krzesła);
        Sklep skelp = new Sklep(wyposazenie);
        skelp.wyswietlOferty();




    }
}
