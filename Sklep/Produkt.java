import java.util.Objects;

public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    Produkt(String nazwa, double cena, int iloscNaMagazynie)
    {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
        dodajDoMagazynu(iloscNaMagazynie);
    }

    /*
    @Override
    public String getClass()
    {
        return "Cześć jestem klasą "+this.getClass();
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(cena, produkt.cena) == 0 && Objects.equals(nazwa, produkt.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }

    @Override
    public String toString()
    {
        return "nazwa: "+ nazwa +"\n" + "cena: "+ cena+"\n" + "ilosc na magazynie: "+iloscNaMagazynie;
    }

    public void dodajDoMagazynu(int ilosc)
    {
        Magazyn.produkty.put(this, Magazyn.produkty.getOrDefault(this, 0) + ilosc);
        iloscNaMagazynie += ilosc;
    }

    public void usunZMagazynu(int ilosc)
    {
        if(iloscNaMagazynie > ilosc)
        {
            Magazyn.produkty.put(this, iloscNaMagazynie - ilosc);
            iloscNaMagazynie -= ilosc;
        }
        else if(iloscNaMagazynie == ilosc)
        {
            Magazyn.produkty.remove(this);
            iloscNaMagazynie = 0;
        }
    }
}