package int103;
 
import business.Data;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import lab.Group;
 
 
public class Int103t08 {
 
    public static void main(String[] args) {
        testGroup();
        testStream();
    }
    private static void testGroup() {
//        List<Data> id = new ArrayList<>();
//        id.add(null);
//        Group<Data> g = new Group<>(id);
        Group<Data>  g;
        g = new Group(new ArrayList<>(), true);
        g = new Group(ArrayList<Data>::new, true);
        g.add(new Data(0, "Zero", 0.0));
        g.add(null);
        g.add(new Data(4, "Four", 4.0));
        g.add(new Data(6, null, 6.0));
        g.add(new Data(10, "Ten", 10.0));
//        g.sort((Data d1, Data d2) -> {
//            if (d1 == d2) return 0;
//            if (d1 == null) return 1;
//            if (d2 == null) return -1;
//            return d1.getName().compareTo(d2.getName());
//        });
//        g.sort (Comparator.nullsLast(Comparator.comparing(Data :: getName)));
        g.sort(Comparator.nullsLast(Comparator.comparing(Data::getName, Comparator.nullsLast(Comparator.naturalOrder()))));     
        System.out.println("Printing Name: ");
        g.forEach(d -> System.out.print(" " + (d == null ? "NULL" : d.getName())));
        System.out.println();
        System.out.println("group: " + g);
//        g.removeIf((Data t) -> (t == null ? false : t.getName().contains("e")));
        g.removeIf((Data t) -> (t == null || t.getName() == null ? false : t.getName().contains("e")));
        System.out.println("group after removing e: " + g);
 
    }
    private static void testStream(){
    List<Data> d = List.of(new Data(10,"Ten",100.0), new Data(2,"Two",2.2), new Data(5,"Five", 500.55));
//    var s = d.stream();
//    var t = s.filter(x -> x.getName().contains("T"));
//    var u = t.map(( x1) -> x1.getId() + x1.getValue());
//    u.forEach(System.out::println);
    d.parallelStream()
         .filter(x -> x.getName().contains("T"))   
         .map(( x1) -> x1.getId() + x1.getValue())
         .forEach(System.out::println);
    }
}