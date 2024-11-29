public class Adres {
    String ulica;
    int numerDomu;
    Integer numerMieszkania;
    String miasto;
    String kodPocztowy;

    public Adres(String ulica, int numerDomu, int numerMieszkania, String miasto, String kodPocztowy)
    {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, int numerDomu, String miasto, String KodPocztowy)
    {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = KodPocztowy;
    }

    @Override
    public String toString() {
        if(numerMieszkania != null)
            return "Kod Pocztowy: " + kodPocztowy + " Miasto: "+miasto+ '\n' +
                "Ulica: " + ulica +" numer domu: "+numerDomu + " numer mieszkania: "+numerMieszkania;
        return "Kod Pocztowy: " + kodPocztowy + " Miasto: "+miasto+ '\n' +
                "Ulica: " + ulica +" numer domu: "+numerDomu;
    }

    public boolean przed(String kodPocztowy1, String kodPocztowy2)
    {
        String temp1 = kodPocztowy1.replace("-", "");
        String temp2 = kodPocztowy2.replace("-", "");
        int kod1 = Integer.parseInt(temp1);
        int kod2 = Integer.parseInt(temp2);
        if(kod1 < kod2)
            return true;
        return false;
    }
}
