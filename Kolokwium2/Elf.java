import java.util.Objects;

public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;

    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public void przedstawSie()
    {
        System.out.println("Cześć, nazywam się "+imie+", mam "+wiek+" lat, a moje stanowisko pracy to "+stanowisko+".");
    }

    @Override
    public String toString() {
        return "Imie: " + imie +", Wiek: " + wiek +", Stanowisko: " + stanowisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elf elf = (Elf) o;
        return wiek == elf.wiek && Objects.equals(imie, elf.imie) && Objects.equals(stanowisko, elf.stanowisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek, stanowisko);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie != null && !imie.isEmpty())
            this.imie = imie;
        else
            throw new IllegalArgumentException();
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek > 0)
            this.wiek = wiek;
        else
            throw new IllegalArgumentException();
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        if(stanowisko != null && !stanowisko.isEmpty())
            this.stanowisko = stanowisko;
        else
            throw new IllegalArgumentException();
    }
}
