
package school;


//public enum EduLevel {UNDERGRAD, MASTER, PHD}

public class EduLevel {
    private String name;
    
    public static final EduLevel UNDERGRAD = new EduLevel("undergrad");
    public static final EduLevel MASTER = new EduLevel("master");
    public static final EduLevel PHD = new EduLevel("PhD");
    
   private EduLevel(String name) { this.name = name; }
    @Override public String toString() { return name; }
    
}
