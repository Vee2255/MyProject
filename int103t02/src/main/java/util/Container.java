
package util;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;


public class Container<T> {
    protected Object[] oa;
    protected int count;
    public Container(int n) { 
        if (n < 1)
            throw new IllegalArgumentException ("n connot be less than 1");
        this.oa = new Object[n];
        this.count = 0;
    }
    public int getCount(){
        return count;
    }
    public Object get(int i){
        if (i>= count) 
            throw new IndexOutOfBoundsException("Over");
        return oa[i];}
    public void set (int i, Object o) {
        if (i>= count) 
            throw new IndexOutOfBoundsException("Over");
        oa[i] = Objects.requireNonNull(o, "object cannot be null");
    }
    public Object add(Object o){
    Objects.requireNonNull(o, "object cannot be null");
    expand();
    oa[count++] = o;
    return o;                                 
    }
    private void expand(){
        Arrays.copyOf(oa, count<<1);
    }

    @Override
    public String toString() {
      StringJoiner j =new StringJoiner("\n","Contianer(\n","\n)");  
      for (int i = 0; i < count; i++ ){
      j.add(oa[i].toString());
      }
      return j.toString();
    }
    
    
}
    
