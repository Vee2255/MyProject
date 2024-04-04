package items;

public class Property extends Asset {
    private String location; 

    public Property(String location, String name, double value) {
        super(name, value);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    
    
}
