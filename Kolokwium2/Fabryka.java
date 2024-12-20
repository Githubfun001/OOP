import java.util.ArrayList;
import java.util.Objects;

public class Fabryka {
    private ArrayList<Elf> listaElfow;
    private int dlGeo;
    private int szGeo;

    public Fabryka(ArrayList<Elf> listaElfow, int dlGeo, int szGeo) {
        this.listaElfow = listaElfow;
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
    }

    public void dodajPracownika(Elf elf)
    {
        listaElfow.add(elf);
    }

    public void usunPracownika(Elf elf)
    {
        listaElfow.remove(elf);
    }

    public Elf najstarszyPracownik()
    {
        if(listaElfow.isEmpty())
        {
            return null;
        }

        Elf temp = listaElfow.getFirst();
        for(Elf elf : listaElfow)
        {
            if(elf.getWiek() > temp.getWiek())
            {
                temp = elf;
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Elfy: " + listaElfow.toString() +", Lokalizacja: " + dlGeo +", " + szGeo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fabryka fabryka = (Fabryka) o;
        return dlGeo == fabryka.dlGeo && szGeo == fabryka.szGeo && Objects.equals(listaElfow, fabryka.listaElfow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listaElfow, dlGeo, szGeo);
    }

    public ArrayList<Elf> getListaElfow() {
        return listaElfow;
    }

    public void setListaElfow(ArrayList<Elf> listaElfow) {
        if(listaElfow != null)
            this.listaElfow = listaElfow;
        else
            throw new IllegalArgumentException();
    }

    public int getDlGeo() {
        return dlGeo;
    }

    public void setDlGeo(int dlGeo) {
        if(dlGeo >= -180 && dlGeo <= 180)
            this.dlGeo = dlGeo;
        else
            throw new IllegalArgumentException();
    }

    public int getSzGeo() {
        return szGeo;
    }

    public void setSzGeo(int szGeo) {
        if(szGeo >= -90 && szGeo <= 90)
            this.szGeo = szGeo;
        else
            throw new IllegalArgumentException();
    }
}
