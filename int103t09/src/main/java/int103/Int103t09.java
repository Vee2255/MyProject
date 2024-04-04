package int103;

import java.util.ArrayList;
import school.Classroom;
import school.EduLevel;
import school.Gender;
import school.Student;

public class Int103t09 {

    public static void main(String[] args) {
        testStudent();
        testClassroom();

    }

    public static void testStudent() {
        var s = new Student(10, "First", EduLevel.UNDERGRAD, Gender.MALE);
        System.out.println("s =" + s);
    }

    public static void testClassroom() {
        var cr = new Classroom();
        var cr2 = new Classroom(() -> new ArrayList<Student>());
        var cr3 = new Classroom(ArrayList<Student>::new);
        System.out.println("cr" + cr);
        System.out.println("cr2" + cr);
        System.out.println("cr3" + cr);
        cr.enroll(new Student(1, "First", EduLevel.UNDERGRAD, null));
        cr.enroll(new Student(3, "Third", EduLevel.MASTER, Gender.FEMALE));
        cr.enroll(new Student(8, "Zeroth", EduLevel.PHD, Gender.FEMALE));
        cr.enroll(new Student(5, "Tenth", EduLevel.UNDERGRAD, null));
        cr.enroll(new Student(2, "Second", EduLevel.UNDERGRAD, null));
        cr.enroll(new Student(6, "Sixth", EduLevel.UNDERGRAD, null));
        cr.enroll(new Student(4, "Forth", EduLevel.UNDERGRAD, null));

        System.out.println("1. =================");

        cr.stream().forEach(x -> System.out.println(" " + x));

        System.out.println("2. =================");

        cr.stream().forEach((x) -> System.out.println(" " + x));
        System.out.println("3. =================");
        cr.stream().forEach((Student x) -> System.out.println(" " + x));

        System.out.println("4. =================");
        cr.stream().map((Student x) -> " " + x.toString()).forEach(System.out::println);
        System.out.println("5. =================");
        cr.stream().map(x -> " " + x).forEach(System.out::println);
        System.out.println("6. =================");
        cr.stream().map(x -> " " + x).skip(2).sorted().forEach(System.out::println);
        System.out.println("7. =================");
        cr.stream().map(x -> " " + x).sorted().skip(2).forEach(System.out::println);

    }

}
