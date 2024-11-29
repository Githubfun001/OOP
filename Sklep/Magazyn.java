import java.util.HashMap;
import java.util.stream.Collectors;

public class Magazyn {
    static HashMap<Produkt, Integer> produkty;

    public Magazyn()
    {
        produkty = new HashMap<>();
    }

    @Override
    public String toString() {
        return produkty.entrySet().stream()
                .map(entry -> entry.getKey().nazwa + " : " + entry.getValue())
                .collect(Collectors.joining("\n"));
    }
}
