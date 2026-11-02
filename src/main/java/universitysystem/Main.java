package universitysystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();

        while (true) {
            System.out.println("\n===== UNIVERSITY MENU =====");
            System.out.println("1. Add student");
            System.out.println("2. List students");
            System.out.println("3. Remove student");
            System.out.println("4. Add course");
            System.out.println("5. List courses");
            System.out.println("6. Remove course");
            System.out.println("7. Enroll student in course");
            System.out.println("8. Change an enrollment's course");
            System.out.println("9. Show students with their courses");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                if (choice == 1) {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    studentDAO.addStudent(name, email);
                    System.out.println("Student added.");

                }                  else if (choice == 2) {
                System.out.println("TEST: option 2 started");
                studentDAO.listStudents();
                System.out.println("TEST: option 2 finished");

                } else if (choice == 3) {
                    System.out.print("Student id: ");
                    studentDAO.deleteStudent(Integer.parseInt(sc.nextLine()));
                    System.out.println("Done.");

                } else if (choice == 4) {
                    System.out.print("Course title: ");
                    courseDAO.addCourse(sc.nextLine());
                    System.out.println("Course added.");

                } else if (choice == 5) {
                    courseDAO.listCourses();

                } else if (choice == 6) {
                    System.out.print("Course id: ");
                    courseDAO.deleteCourse(Integer.parseInt(sc.nextLine()));
                    System.out.println("Done.");

                } else if (choice == 7) {
                    System.out.print("Student id: ");
                    int studentId = Integer.parseInt(sc.nextLine());
                    System.out.print("Course id: ");
                    int courseId = Integer.parseInt(sc.nextLine());
                    enrollmentDAO.enroll(studentId, courseId);
                    System.out.println("Enrolled.");

                } else if (choice == 8) {
                    System.out.print("Enrollment id: ");
                    int enrollmentId = Integer.parseInt(sc.nextLine());
                    System.out.print("New course id: ");
                    int newCourseId = Integer.parseInt(sc.nextLine());
                    enrollmentDAO.changeCourse(enrollmentId, newCourseId);
                    System.out.println("Updated.");

                } else if (choice == 9) {
                    enrollmentDAO.showStudentsWithCourses();

                } else if (choice == 0) {
                    System.out.println("Goodbye!");
                    break;

                } else {
                    System.out.println("Choose a number from 0 to 9.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please type a number.");
            } catch (Exception e) {
                System.out.println("Database error: " + e.getMessage());
            }
        }
    }
}