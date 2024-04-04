package lab;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import static jdk.dynalink.linker.support.Guards.isArray;
 
public class Group<T> {
 
    private List<T> list;
 
    public Group() {
        list = new ArrayList<T>();
    }
    public Group(boolean isArray) {
        list = isArray ? new ArrayList<>() : new LinkedList<>();
    }
    public Group(List<T> list, boolean x) {
        if (x) this.list = list;
    }
    public Group(Supplier<List> s, boolean x) {
        if (x) this.list = s.get();
    }
//    public Group(IntFunction<List> s, int i) {
//        this.list = s.apply(i);
//    }
//    
    public int size() {
        return list.size();
    }
 
    public boolean isEmpty() {
        return list.isEmpty();
    }
 
    public boolean contains(Object o) {
        return list.contains(o);
    }
 
    public Iterator<T> iterator() {
        return list.iterator();
    }
 
    public Object[] toArray() {
        return list.toArray();
    }
 
    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }
 
    public boolean add(T e) {
        return list.add(e);
    }
 
    public boolean remove(Object o) {
        return list.remove(o);
    }
 
    public boolean removeIf(Predicate<? super T> filter) {
        return list.removeIf(filter);
    }
    public void sort(Comparator<? super T> c) {
        list.sort(c);
    }
 
    public void clear() {
        list.clear();
    }
 
    public T get(int index) {
        return list.get(index);
    }
 
    public T set(int index, T element) {
        return list.set(index, element);
    }
 
    public void add(int index, T element) {
        list.add(index, element);
    }
 
    public T remove(int index) {
        return list.remove(index);
    }
 
    public int indexOf(Object o) {
        return list.indexOf(o);
    }
 
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }
 
    public void forEach(Consumer<? super T> action) {
        list.forEach(action);
    }
 
    @Override
    public String toString() {
        return list.toString();
    }
}
