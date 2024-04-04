package school;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Classroom {

    private List<Student> members;

    public Classroom() {
        members = new LinkedList<>();
    }
    
    
    public Classroom(List<Student> list) {
        members = list;
    }

    public Classroom(Supplier<List<Student>> constructor) {

    }
    public boolean enroll (Student s){
     if(s == null) return false;
     members.add(s);
     return true;
    }

    @Override
    public String toString() {
        return "Classroom{" + "members=" + members + '}';
    }
    public Stream<Student> stream() {return members.stream();}
}
