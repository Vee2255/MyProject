package ecommerce;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Cart<G> {
    private final Map<G,Integer> bag;
    
    public Cart() {
        bag = new TreeMap();
    }
    
    public int add(G g) {
        var x = bag.get(g);
        if (x == null) x = 0;
        x = x + 1;
        bag.put(g, x);
        return x;
    }
    public int remove(G g) {
        var x = bag.remove(g);
        return x==null ? 0 : x;
    }
    public Set<G> getAll() {
        return bag.keySet();
    }
    public int get(G g) {
        var x = bag.get(g);
        return x == null ? 0 : x;
    }
}