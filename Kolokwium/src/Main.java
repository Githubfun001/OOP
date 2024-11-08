public class Main {
    public static void main(String[] args) {
        System.out.println(dokladnosc(6.31,6.30,2));
        System.out.println(najblizszySasiad(20));
        System.out.println(pierwiastek(20, 2, 2));
        int[] tab = {1,2,0,3,5,1,4};
        System.out.println(podciag(tab));
        System.out.println(czyPalindrom(121));
        palindromLiczbowy(2);
    }

    public static boolean dokladnosc(double x, double y, int k){
        return (Math.abs(y-x) <= Math.pow(10, -k));
    }

    public static int najblizszySasiad(int S)
    {
        double x = Math.sqrt(S);
        double temp = x*10;
        temp = (int) temp%10;
        if(temp<5)
            return (int)x;
        return (int)x+1;
    }

    public static double pierwiastek(int S, int n, int k)
    {
        double x = 1;
        double x1 = ((x*(n-1)) + (S/Math.pow(x, n-1)))/2;
        while(Math.abs(x1-x) >= Math.pow(10, -k))
        {
            x=x1;
            x1 = ((x*(n-1)) + (S/Math.pow(x, n-1)))/2;
        }
        return ((int) (x1*Math.pow(10, k))) / Math.pow(10, k);
    }

    public static int podciag(int[] tab)
    {
        int max = 0;
        int count = 1;
        for(int i = 0; i < tab.length; i++)
        {
            int temp = tab[i];
            for(int j = i; j < tab.length; j++) {
                if (temp > tab[j])
                {
                    count++;
                    temp = tab[j];
                }
                if(tab[j] > temp && tab[j] < tab[i])
                {
                    temp = tab[j];
                }
            }
            if (count > max)
            {
                max = count;
            }
            count = 1;

        }
        if(max == 1)
            return 0;
        return max;
    }

    public static boolean czyPalindrom(int n) {
        if (n < 0) {
            return false;
        }

        int original = n;
        int reversed = 0;

        while (n != 0) {
            int temp = n % 10;
            reversed = reversed * 10 + temp;
            n /= 10;
        }

        return original == reversed;
    }

    public static void palindromLiczbowy(int m)
    {
        for(int i = (int) (Math.pow(10,m-1)); i < Math.pow(10,m); i++)
        {
            for(int j = i; j < Math.pow(10,m); j++)
            {
                boolean temp = czyPalindrom(i*j);
                if (temp)
                {
                    System.out.println(i + "x" + j + "=" + i*j);
                }
            }
        }
    }
}