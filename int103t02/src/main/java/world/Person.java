package world;

import java.util.Objects;


public class Person {
    // name (string)
    private String name ;

     // constructor (name not null)
    public Person(String name) {
        
        if (name == null){
        throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }
// getter/setter (name not null)
    public String getName() {
        if (name == null){
        throw new IllegalArgumentException("Name cannot be null");
                }
        return name;
    }

     // toString
    public void setName(String name) {
        if (name == null){
        throw new IllegalArgumentException("Name cannot be null");
                }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
 // equals/hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        return Objects.equals(this.name, other.name);
    }
    
//    public static void main(String[] args) {
//        Person p1 = new Person(null);
//        Person p2= new Person("vee");
//    }

    public int compareTo (Person o){
            return name.compareTo(o.name);
    }
    
}

   