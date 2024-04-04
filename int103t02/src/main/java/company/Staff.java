
package company;



public class Staff extends Employee {
private int days;

    public Staff(int days, int id, double salary, String name) {
        super(id, salary, name);
        if (days < 1){
            throw new IllegalArgumentException ("Day cannot less than 1");
        }
        this.days = days;
        
    }

    

}