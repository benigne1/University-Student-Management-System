package universitysystem;

    public class UndergraduateStudent extends Student {

        public UndergraduateStudent(int id, String name, double marks) {
            super(id, name, marks);
        }

        public double calculateGPA() {
            return getMarks() / 25;
        }
    }

