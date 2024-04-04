package util;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author achmawee
 * @param <T>
 */
public class Box<T> extends Container<T> {
 
    public Box(int n) {
        super(n);
    }
 
    public T remove(T item) {
        for (int i = 0; i < count; i++) {
            if (oa[i].equals(item)) {
 
                T removedItem = (T) oa[i];
 
                for (int j = i + 1; j < count; j++) {
                    oa[j - 1] = oa[j];
                }
                oa[count - 1] = null;
 
                count--;
                return removedItem;
            }
        }
        return null;
    }
    
 
}