import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<Character, Integer> test = new TreeMap<>();
        test.put('a', 1); test.put('b', 2); test.put('c', 3); test.put('d', 4);
        System.out.println(subMapInRange(test, 'b','d'));
    }

    public static <T> void printUnique(Collection<T> items) {
        Set<T> unique = new HashSet<T>(items);
        unique.retainAll(items);
        System.out.println(unique);
    }

    public static <T> int countOccurences(Collection<T> items, T element) {
        int count = 0;
        for (T item : items) {
            if (item.equals(element)) {
                count++;
            }
        }
        return count;
    }

    public static <T> ArrayList<T> mergeLista(ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static <T> TreeSet<T> findElementsInRange(TreeSet<T> set, T lowerBound, T upperBound) {
        TreeSet<T> result = new TreeSet<>();
        result = (TreeSet<T>) set.subSet(lowerBound, true, upperBound, true);

        return result;
    }

    public static <T> boolean isPalindrome(LinkedList<T> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> HashMap<V, Integer> countValueOccurences(HashMap<K, V> map){
        HashMap<V, Integer> result = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if(result.containsKey(entry.getValue())){
                result.put(entry.getValue(), result.get(entry.getValue()) + 1);
            }
            else{
                result.put(entry.getValue(), 1);
            }
        }
        return result;
    }

    public static <K, V> TreeMap<K, V> subMapInRange(TreeMap<K, V> map, K startKey, K endKey) {
        return new TreeMap<>(map.subMap(startKey, true, endKey, true));
    }
}