
package com.mycompany.int103t06;

import ecommerce.Cart;
public class int106t06{

    public static void main(String[] args) {
        testShoppingCart();
        testFregCount("sfdsdsdfsdfsdsfdsdfsdjnhbv");
    }
    static void testFregCount(String s){
    
        Cart cart = new Cart<String>();
        for (int i=0; i<s.length() ; i++){
         char c = s.charAt(i);
         cart.add(c);
         
     
        }
        System.out.println(cart.getAll());
        
        for (Object key : cart.getAll()){
            System.out.println(key.toString() + ": " + cart.get(key));
        }
    }
    
    static void testShoppingCart() {
    var c = new Cart<String>();
    c.add("Shirt");
    c.add("Shirt");
    c.add("Watch");
    c.add("Pen");
    c.add("Wacth");
    c.add("Wacth");
    c.remove("Wacth");
        System.out.println("List all items:");
    for (var g : c.getAll()){
        System.out.println("Item" + g + "");
    }
    
    }
}
