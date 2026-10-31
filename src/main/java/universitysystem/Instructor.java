package universitysystem;

public class Instructor extends Person {
    private String department;

    public Instructor(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String toString() {
        return "Instructor " + super.toString() + " (" + department + ")";
    }
}
