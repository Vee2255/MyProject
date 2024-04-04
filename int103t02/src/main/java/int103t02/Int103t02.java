
package int103t02;

import company.Employee;
import company.Staff;
import util.Container;
import world.Person;

public class Int103t02 {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        testPerson();
        testCollection();
    }
    static void testPerson() {
        Person p, p2;
        try {
        // p = new Person(null);
        } catch (Exception e) {
            System.out.println("new Person with null string.");
        }
        p = new Person("Somchai");
        System.out.println("Person: " + p);
        System.out.println("Name: " + p.getName());
//        p.setName(null);
        System.out.println("Person: " + p);
        p.setName("Somsak");
        System.out.println("Person: " + p);
        p2 = new Person("Somsak");
        System.out.println("Name: " + p2.getName());
        System.out.println("p2: " + p2);
        System.out.println("p == p2 ? " + ( p==p2));
        System.out.println("p.equals(p2) ? " + p.equals(p2));
    }
    
    static void testCollection() {
    Container c = new Container(3);
    c.add(new Person("First"));
    c.add(new Employee(10, 100.0,"Seccond"));
    c.add(new Staff(2,100,1000.0,"Third"));
        System.out.println("Container" + c );
        for (int i = 0; i < c.getCount(); i++) {
           Object o = c.get(i);
           if (c.get(i).getClass().equals(Employee.class)) {
            System.out.println("Name: "+ ((Employee) c.get(i)).getId());
           }
       }
    }
   
}
