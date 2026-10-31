package universitysystem;
public class Student extends Person {
    private double marks;

    public Student(int id, String name, double marks) {
        super(id, name);
        this.marks = marks;
    }

    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    public double calculateGPA() {
        return marks / 25;
    }

    public String toString() {
        return "Student " + super.toString() + " GPA: " + calculateGPA();
    }
}