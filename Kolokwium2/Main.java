import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Elf elf1 = new Elf("Dawid", 18, "pomocnik mikołaja");
        Elf elf2 = new Elf("dashdb", 31, "stanowisko");
        Elf elf3 = new Elf("cnfgn", 12, "stanowisko");
        Elf elf4 = new Elf("uruir", 75, "stanowisko");
        Elf elf5 = new Elf("poik", 63, "stanowisko");
        Elf elf6 = new Elf("bvnfgh", 81, "stanowisko");

        elf1.przedstawSie();

        Fabryka fabryka = new Fabryka(new ArrayList<>(), 10, 20);
        fabryka.dodajPracownika(elf1);
        fabryka.dodajPracownika(elf2);
        fabryka.dodajPracownika(elf3);
        fabryka.dodajPracownika(elf4);
        fabryka.dodajPracownika(elf5);
        fabryka.dodajPracownika(elf6);

        System.out.println(fabryka.najstarszyPracownik());
        System.out.println(fabryka);

        Renifer renifer1 = new Renifer("Rudolf", 100);
        renifer1.nakarmRenifera();
        renifer1.nakarmRenifera();
        Renifer renifer2 = new Renifer("Rudolf3", 150);
        Renifer renifer3 = new Renifer("Rudolf6", 200);
        Renifer renifer4 = new Renifer("Rudolf8", 250);

        Sanie sanie = new Sanie(new ArrayList<>());
        sanie.dodajRenifera(renifer1);
        sanie.dodajRenifera(renifer2);
        sanie.dodajRenifera(renifer3);
        sanie.dodajRenifera(renifer4);

        System.out.println(sanie.najwolniejszyRenifer());
        sanie.sumaPredkosci();
        System.out.println(sanie);

    }
}