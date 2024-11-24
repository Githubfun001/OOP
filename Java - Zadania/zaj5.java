import java.util.ArrayList;
import java.util.List;

public class zaj5 {
    public static void main(String[] args){
        ArrayList<Integer> tab1 = new ArrayList<Integer>();
        tab1.add(3); tab1.add(5); tab1.add(7); tab1.add(12); tab1.add(30);
        ArrayList<Integer> tab2 = new ArrayList<Integer>();
        tab2.add(1); tab2.add(4); tab2.add(5); tab2.add(5); tab2.add(7); tab2.add(7);tab2.add(9); tab2.add(18);
        //System.out.println(append(tab1, tab2));
        //uniqueArrayList(tab2);
        //System.out.println(merge(tab1,tab2));
        System.out.println(mergeSorted(tab1,tab2));
    }
    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2)
    {
        ArrayList<Integer> sol = new ArrayList<Integer>();
        sol.addAll(tab1);
        sol.addAll(tab2);
        return sol;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2)
    {
        ArrayList<Integer> sol = new ArrayList<Integer>();
        int i=0;
        while(i<Math.max(tab1.size(),tab2.size()))
        {
            if(i<tab1.size())
                sol.add(tab1.get(i));
            if(i<tab2.size())
                sol.add(tab2.get(i));
            i++;
        }
        return sol;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> sol = new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(i<tab1.size() && j<tab2.size())
        {
            if(tab1.get(i) < tab2.get(j))
                sol.add(tab1.get(i++));
            else
                sol.add(tab2.get(j++));
        }
        while(i<tab1.size())
            sol.add(tab1.get(i++));
        while(j<tab2.size())
            sol.add(tab2.get(j++));
        return sol;
    }

    public static void uniqueArrayList(ArrayList<Integer> tab)
    {
        ArrayList<ArrayList<Integer>> sol = new ArrayList<ArrayList<Integer>>();
        int flag = tab.get(0);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(flag);
        temp.add(0);
        sol.add(temp);
        for(int i=1;i<tab.size();i++)
        {
            if(tab.get(i)!=flag)
            {
                flag = tab.get(i);
                temp = new ArrayList<Integer>();
                temp.add(flag);
                temp.add(0);
                sol.add(temp);
            }
        }
        System.out.println(sol);
    }
}
