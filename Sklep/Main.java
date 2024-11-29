import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Produkt krzeslo = new Produkt("krzeslo", 19.99, 7);
        Produkt stol = new Produkt("stol", 25.89, 10);
        Produkt blat = new Produkt("blat", 27.49, 10);

        Sklep sklep = new Sklep();
        sklep.dodajProdukt(krzeslo); sklep.dodajProdukt(stol); sklep.dodajProdukt(blat);
        Klient klient = new Klient("Jan", "Kowalski");
        KoszykZakupowy koszyk = new KoszykZakupowy();

        sklep.zakupy(koszyk, krzeslo, 2);

        Zamowienie zamowienie = new Zamowienie(koszyk);
        zamowienie.wyswietlZamowienie();
        System.out.println();
        System.out.println(zamowienie.platnosc.statusPlatnosci);
        System.out.println();
        zamowienie.platnosc.zaplac();
        System.out.println();
        System.out.println("=== Płacenie ===");
        System.out.println();
        System.out.println(zamowienie.platnosc.statusPlatnosci);
        System.out.println();
        System.out.println("=== Zwracanie Produktu ===");
        zamowienie.zwrocProdukt(krzeslo, 1);
        System.out.println();
        zamowienie.wyswietlZamowienie();
        System.out.println();
        System.out.println("=== Finalizowanie ===");
        System.out.println();
        zamowienie.finalizujZamowienie();
        zamowienie.wyswietlZamowienie();
    }
}