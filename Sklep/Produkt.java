public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    Produkt(String nazwa, double cena, int iloscNaMagazynie)
    {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje()
    {
        System.out.println("nazwa: "+ nazwa);
        System.out.println("cena: "+ cena);
        System.out.println(("ilosc na magazynie: "+iloscNaMagazynie));
    }

    public void dodajDoMagazynu(int ilosc)
    {
        iloscNaMagazynie += ilosc;
    }

    public void usunZMagazynu(int ilosc)
    {
        if(iloscNaMagazynie >= ilosc)
            iloscNaMagazynie -= ilosc;
    }
}