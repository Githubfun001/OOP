public class Main2 {
    public static void main(String[] args) {
        //trojkiPitagorejskie(20);
        //funKwaRozwiazania(10);
        //funKwaDelta(20);
        //liczbyPierwsze(26);
        //liczbyPodzielne(3,5);
        //piramida(10,2);
        //System.out.print(silnia(5));
        //silniaPodwojna(5);
        //silniaM(9,4);
        //dwumianNewtona(10,3);
        //ciagFibonacciego(6);
        //sumaN(10);
        System.out.print(czyPalindrom("kajak"));
    }
    static void trojkiPitagorejskie(int n){
        for(int a=1;a<=n;a++){
            for(int b=1;b<a;b++){
                for(int c=1;c<=n;c++){
                    if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){
                        System.out.print(a+" "+b+" "+c);
                        System.out.println();
                    }
                }
            }
        }
    }
    static void funKwaRozwiazania(int n){
        for(int a=1;a<=n;a++){
            for(int b=0;b<=n;b++){
                for(int c=0;c<=n;c++){
                    if(Math.pow(b,2) - 4*a*c >= 0){
                        System.out.print(a+" "+b+" "+c);
                        System.out.println();
                    }
                }
            }
        }
    }
    static void funKwaDelta(int n){
        for(int a=1;a<=n;a++){
            for(int b=0;b<=n;b++){
                for(int c=0;c<=n;c++){
                    double delta = Math.pow(b,2) - 4*a*c;
                    double pDelta = Math.sqrt(delta);
                    if(Math.sqrt(pDelta) == (int) Math.sqrt(pDelta)){
                        System.out.print(a+" "+b+" "+c);
                        System.out.println();
                    }
                }
            }
        }
    }
    static void liczbyPierwsze(int n) {
        for (int j = 2; j <= n; j++) {
            boolean sol = true;
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    sol = false;
                    break;
                }
            }
            if (sol) {
                System.out.print(j + " ");
            }
        }
    }
    static void liczbyPodzielne(int m, int n) {
        for(double i=Math.pow(10,m-1); i<=Math.pow(10,m)-1;i++){
            if(i % n ==0){
                System.out.print((int)i + " ");
            }
        }
    }
    static void piramida(int n, int variant){
        if(variant == 1){
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
        if(variant == 2){
            for(int i=0;i<n;i++){
                for(int j=n-1-i;j>0;j--){
                    System.out.print(" ");
                }
                for(int j=0;j<=i;j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
    }
    static int silnia(int n){
        int wynik=1;
        for(int i=1;i<=n;i++){
            wynik*=i;
        }
        return wynik;
    }
    static void silniaPodwojna(int n){
        int wynik=1;
        for(int i=1;i<=n;i += 2){
            wynik*=i;
        }
        System.out.println(wynik);
    }
    static void silniaM(int n, int m){
        int wynik=1;
        for(int i=1;i<=n;i += m){
            wynik*=i;
        }
        System.out.println(wynik);
    }
    static void dwumianNewtona(int n, int k){
        int wynik=silnia(n)/(silnia(k)*silnia(n-k));
        System.out.println(wynik);
    }
    static void ciagFibonacciego(int n){
        int a=0;
        int b=1;
        int pom;
        System.out.print(a +" ");
        if(n==1){
            return;
        }
        System.out.print(b + " ");
        if(n==2){
            return;
        }
        for(int i=2;i<n;i++){
            pom = a+b;
            a = b;
            b = pom;
            System.out.print(b + " ");
        }
    }
    static void sumaN(int n){
        int wynik=0;
        for(int i=1;i<=n;i++){
            wynik+=i;
        }
        System.out.println("Suma naturalnych: "+wynik);
        wynik = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                wynik+=i;
            }
        }
        System.out.println("Suma parzystych: "+wynik);
        wynik = 0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                wynik+=i;
            }
        }
        System.out.println("Suma nieparzystych: "+wynik);
        wynik = 0;
        for(int i=1;i<=n;i++){
            wynik+=i*i;
        }
        System.out.println("Suma kwadratów liczb naturalnych: "+wynik);
        wynik = 0;
        for(int i=1;i<=n;i++){
            wynik+=i*i*i;
        }
        System.out.println("Suma sześcianów liczb naturalnych: "+wynik);
        double wynikOdwrotnisci = 0;
        for(double i=1;i<=n;i++){
            wynikOdwrotnisci+=1/i;
        }
        System.out.println("Suma odwrotnosci liczb naturalnych: "+wynikOdwrotnisci);
    }
    static boolean czyPalindromInt(String n){
        for(int i=0;i<n.length()/2;i++){
            if(n.charAt(i)!=n.charAt(n.length()-i-1)){
                return false;
            }
        }
        return true;
    }


    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
