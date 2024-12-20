import java.util.ArrayList;
import java.util.Objects;

public class Sanie {
    private ArrayList<Renifer> zaprzeg;

    public Sanie(ArrayList<Renifer> zaprzeg) {
        this.zaprzeg = zaprzeg;
    }

    public void dodajRenifera(Renifer renifer)
    {
        zaprzeg.add(renifer);
    }

    public void sumaPredkosci()
    {
        int wynik = 0;
        for(Renifer renifer : zaprzeg)
        {
            wynik += renifer.getPredkosc();
        }
        System.out.println("Suma predkosci: "+wynik);
    }

    public Renifer najwolniejszyRenifer()
    {
        if(zaprzeg.isEmpty())
        {
            return null;
        }

        Renifer temp = zaprzeg.getFirst();
        for(Renifer renifer : zaprzeg)
        {
            if(renifer.getPredkosc() < temp.getPredkosc())
            {
                temp = renifer;
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Renifery: " + zaprzeg.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sanie sanie = (Sanie) o;
        return Objects.equals(zaprzeg, sanie.zaprzeg);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(zaprzeg);
    }

    public ArrayList<Renifer> getZaprzeg() {
        return zaprzeg;
    }

    public void setZaprzeg(ArrayList<Renifer> zaprzeg) {
        if(zaprzeg != null)
            this.zaprzeg = zaprzeg;
        else
            throw new IllegalArgumentException();
    }
}
