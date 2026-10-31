package universitysystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Lab1Demo {
    public static void main(String[] args) {

        Student a = new UndergraduateStudent(1, "Alice", 80);
        Student b = new GraduateStudent(2, "Brian", 80);
        System.out.println(a);
        System.out.println(b);

        ArrayList<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        System.out.println("Students in list: " + students.size());

        HashSet<Student> roster = new HashSet<>();
        roster.add(a);
        roster.add(a);
        System.out.println("Students in set: " + roster.size());

        Instructor teacher = new Instructor(1, "Dr. Mukamana", "IS");
        HashMap<String, Instructor> teachers = new HashMap<>();
        teachers.put("Java", teacher);
        System.out.println("Java is taught by " + teachers.get("Java").getName());
    }
}
