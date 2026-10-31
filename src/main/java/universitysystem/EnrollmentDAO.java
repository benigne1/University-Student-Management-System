package universitysystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EnrollmentDAO {

    public void enroll(int studentId, int courseId) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO enrollments (student_id, course_id) VALUES (?, ?)");
        ps.setInt(1, studentId);
        ps.setInt(2, courseId);
        ps.executeUpdate();
        con.close();
    }

    public void changeCourse(int enrollmentId, int newCourseId) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
                "UPDATE enrollments SET course_id = ? WHERE id = ?");
        ps.setInt(1, newCourseId);
        ps.setInt(2, enrollmentId);
        ps.executeUpdate();
        con.close();
    }

    public void showStudentsWithCourses() throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
                "SELECT enrollments.id, students.name, courses.title "
                        + "FROM enrollments "
                        + "JOIN students ON enrollments.student_id = students.id "
                        + "JOIN courses ON enrollments.course_id = courses.id");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println("Enrollment " + rs.getInt("id") + ": "
                    + rs.getString("name") + " -> " + rs.getString("title"));
        }
        con.close();
    }
}
