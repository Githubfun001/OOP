import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] tab1 = {"a", "f" , "c", "d", "h", "b", "g", "e"};
        Integer[] tab2 = {4, 2, 7, 89, 4, 67, 23, 4, 6, 8, 3};
        Double[] tab3 = {5.6, 2.8, 8.8, 123.3, 6.4, 346.43, 23.976};
        sortDescending(tab1);
        System.out.println(Arrays.toString(tab1));
        sortDescending(tab2);
        System.out.println(Arrays.toString(tab2));
        sortDescending(tab3);
        System.out.println(Arrays.toString(tab3));
    }


    public static <T extends Comparable<T>> void sortDescending(T[] tab)
    {
        int n = tab.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(tab[i].compareTo(tab[j]) < 0)
                {
                    T temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
    }
}