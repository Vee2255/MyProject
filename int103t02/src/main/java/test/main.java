package test;

import items.Asset;
import util.Box;
import util.Container;

public class main {
    
    public static void main(String[] args) {
        final Box<Asset> box = new Box<>(6);
    
        Asset a1 = new Asset("house", 2000);
        Asset a2 = new Asset("apartment", 1000);
        Asset a3 = new Asset("flat", 5000);
        
        box.add(a1);
        box.add(a2);
        box.add(a3);
        
        System.out.println(box);
        box.remove(a2);
        
        System.out.println(box);
    }
}
