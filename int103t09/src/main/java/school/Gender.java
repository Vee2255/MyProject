
package school;


public enum Gender {
    MALE("man",1), FEMALE("WOMAN",2);
    private final String name;
    private final int num;
    private Gender(String n, int i){name = n; num = i;  }

    @Override
    public String toString() {
        return "Gender{" + "name=" + name + ", num=" + num + '}';
    }
    
}