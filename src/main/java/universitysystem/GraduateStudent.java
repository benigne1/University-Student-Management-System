package universitysystem;

public class GraduateStudent extends Student {

    public GraduateStudent(int id, String name, double marks) {
        super(id, name, marks);
    }

    public double calculateGPA() {
        return getMarks() / 30;
    }
}