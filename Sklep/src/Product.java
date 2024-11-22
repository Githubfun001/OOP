public class Product {
    private String _nazwa;
    private double _cena;
    private int _iloscNaMagazynie;
    private int _iloscWKoszyku;

    public Product(String nazwa, double cena, int iloscNaMagazynie) {
        _nazwa = nazwa;
        _cena = cena;
        _iloscNaMagazynie = iloscNaMagazynie;
    }

    public int getIloscNaMagazynie() {
        return _iloscNaMagazynie;
    }

    public int getIloscWKoszyku() {
        return _iloscWKoszyku;
    }
    public void addIloscWKoszyku(int iloscWKoszyku) {
        _iloscWKoszyku += iloscWKoszyku;
    }

    public String getNazwa() {
        return _nazwa;
    }

    public double getCena() {
        return _cena;
    }

    public void wyswietlInformacje(){
        System.out.println("nazwa: "+ _nazwa);
        System.out.println("cena: "+ _cena);
        System.out.println(("ilosc na magazynie: "+_iloscNaMagazynie));
    }

    public void dodajDoMagazynu(int ilosc)
    {
        _iloscNaMagazynie += ilosc;
    }

    public void usunZMagazynu(int ilosc)
    {
        if(_iloscNaMagazynie >= ilosc)
            _iloscNaMagazynie -= ilosc;
    }
}
