package company;

import world.Person;

//extends Person ... id (int)
public class Employee extends Person {
private int id;
private double salary;
    
//constructor (id > 0)(salary  > 0.0)
    public Employee(int id, double salary, String name) {
        super(name);
        if(id < 1){
        throw new IllegalArgumentException("ID cannot be less than 1");
        }
        
        if(salary < 0.1){
        throw new IllegalArgumentException("ID cannot be less than 0.0");
        }
        
        this.id = id;
        this.salary = salary;
    }

    //getter/seter (id > 0) (salary > 0)
    public int getId() {
        if(id < 1){
        throw new IllegalArgumentException("ID cannot be less than 1");
        }
        
        return id;
    }

    public void setId(int id) {
        if(id < 1){
        throw new IllegalArgumentException("ID cannot be less than 1");
        }
        
        this.id = id;
    }

    public double getSalary() {
         if(salary < 0.1){
        throw new IllegalArgumentException("ID cannot be less than 0.0");
        }
        return salary;
    }

    

    public void setSalary(double salary) {
        if(salary < 1){
        throw new IllegalArgumentException("ID cannot be less than 1");
        }
        this.salary = salary;
    }

    //toString

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", salary=" + salary + '}';
    }
    

    //qruals/hashCode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.id;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
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
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        return Double.doubleToLongBits(this.salary) == Double.doubleToLongBits(other.salary);
    }
    
    

    
    
}

