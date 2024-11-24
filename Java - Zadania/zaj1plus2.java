import java.util.Scanner;

public class zaj1plus2 {
    public static void main(String[] args) {
        /*
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
        zad7();
        zad8();
        zad9();
        zad10();
        zad11();
        zad12();
        zad13();
         */
        //zad14();
        //zad15();
        //zad16();
        //zad17();
        zad18();
    }
    /*
    static void zad1(){
        System.out.println("Filip Nowak");
    }
    static void zad2(){
        String imie = "Filip";
        String nazwisko = "Nowak";
        System.out.println(imie.length() + nazwisko.length());
    }
    static void zad3(){
        String a = "Ala";
        String b = "ma";
        String c = "kota";
        System.out.println(a+ " " + b + " " + c);
    }
    static void zad4(){
        System.out.println("                    *");
        System.out.println("                    * *");
        System.out.println("                    * * *");
        for(int i=0;i<14;i++){
            System.out.print(" *");
        }
        System.out.println();
        for(int i=0;i<15;i++){
            System.out.print(" *");
        }
        System.out.println();
        for(int i=0;i<14;i++){
            System.out.print(" *");
        }
        System.out.println();
        System.out.println("                    * * *");
        System.out.println("                    * *");
        System.out.println("                    *");
        System.out.println("     *");
        System.out.println("    * *");
        System.out.println("   * * *");
        System.out.println("  * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * * *");
        System.out.println(" * * * * *");
        System.out.println("  * * * *");
        System.out.println("   * * *");
        System.out.println("    * *");
        System.out.println("     *");
    }
    static void zad5(){
        String sol = "Ala ma kota";
        sol = sol.replace("a", "e");
        System.out.println(sol);
    }
    static void zad6(){
        String sol = "Ala ma kota";
        sol = sol.toUpperCase();
        System.out.println(sol);
        sol = sol.toLowerCase();
        System.out.println(sol);
    }
    static void zad7(){
        int a = 'A';
        int b = '!';
        int c = '@';
        int d = '>';
        int e = '~';
        int f = '\n';
        int g = '\b';
        System.out.println("A:"+a+" !:" +b+" @:" +c+" >:" +d+" ~:" +e+" \\n:" +f+" \\b:" +g);
    }
    static void zad8(){
        int a = 'A';
        int b = 'Z';
        int c = 'a';
        int d = 'z';
        int e = '0';
        int f = '9';
        System.out.print("Duże litery od:"+a+" do:"+b);
        System.out.print(" Małe litery od:"+c+" do:"+d);
        System.out.println(" Cyfry od:"+e+" do:"+f);
    }
    static void zad9(){
        String sol = "Grzesiek nie wiedział dlaczego ... jest tak drapieżnym ... mimo, że jego ... na to nie wskazuje.";
        sol = sol.replaceFirst("\\...", "ryś");
        sol = sol.replaceFirst("\\...", "zwierzęciem");
        sol = sol.replaceFirst("\\...", "wygląd");
        System.out.println(sol);
    }
    static void zad10(){
        String sol = "... to jest najlepsza książka napisnana przez ...";
        sol = sol.replaceFirst("\\...", "Moby Dick");
        sol = sol.replaceFirst("\\...", "Hermana Melville’a");
        System.out.println(sol);
    }
    static void zad11(){
        for(int i=0;i<5;i++){
            System.out.print("wodrze");
        }
        System.out.println();
    }
    static void zad12(){
        Date data = new Date();
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Dzisiaj jest "+date.format(data)+" godzina "+time.format(data));
    }
    static void zad13(){
        char a = 54;
        char b = 103;
        char c = 241;
        char d = 67;
        char e = 9999;
        char f = 10;
        char g = (char) 162081;
        System.out.println("54: "+a+" 103:"+b+" 241:"+c+" 67:"+d+" 9999:"+e+" Długośc imienia i nazwiska:"+f+" numer albumu:"+g);
    }
    */
    static void zad14(){
        System.out.println(23.0+76);
        System.out.println(41*2.0+3);
        System.out.println(5-33);
        System.out.println(109%3);
        System.out.println(50/2);
        System.out.println(4|2);
        System.out.println(3^5);
        System.out.println(7&9);
        System.out.println();
    }
    static void zad15(){
        double a = ((Math.sqrt(7)-1)/2)+(Math.pow(3,3)%2);
        double b = (double) 2001 /(26*9);
        double c = (3+Math.sqrt(3))/((Math.sqrt(5)/2)/3)+1;
        double d = 74%5%3;
        double e = (5%5+1)/Math.sqrt(Math.sqrt(2));
        System.out.println((int)a+" "+(int)b+" "+(int)c+" "+(int)d+" "+(int) e);
    }
    static void zad16(){
        Scanner sc = new Scanner(System.in);
        String pierwszeSlowo = sc.nextLine();
        String drugieSlowo = sc.nextLine();
        System.out.println(pierwszeSlowo+" "+drugieSlowo);
    }
    static void zad17(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int suma = a+b;
        int roznica = a-b;
        int iloczyn = a*b;
        int iloraz = a/b;
        System.out.println("Suma:"+suma+" Różnica:"+roznica+" Iloczyn:"+iloczyn+" Iloraz:"+iloraz);
    }
    static void zad18(){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        System.out.println("Powiekszona o 140: "+(x+140));
        System.out.println("Pomniejszona o 31: "+(x-31));
        System.out.println("Powiękoszna o 7 razy: "+(x*7));
        System.out.println("Pomniejszona o 13 razy: "+(x/7));
        System.out.println("Modulo 7: "+(x%7));
        System.out.println("Częśc całkowita z dzielenia przez 4: "+ (int) (x / 4));
        System.out.println("Podniesiona do potęgi 45: "+Math.pow(x,45));
        System.out.println("Iloraz bitowy z 67: "+((int)x|67));
        System.out.println("Suma bitpwa z 59: "+((int)x&59));
        System.out.println("XOR z 23: "+((int)x^23));
        System.out.println("Przesuniętą o 5 bitów w lewo: "+((int)x<<5));
        System.out.println("Przesuniętą o 6 bitów w prawo: "+((int)x<<6));
    }
}