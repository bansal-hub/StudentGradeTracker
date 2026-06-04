import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager {

    private ArrayList<Student> students;

    // Constructor
    public StudentManager() {

        students = new ArrayList<>();
    }

    // Add Student
    public void addStudent(Student student) {

        students.add(student);

        System.out.println("Student added successfully!");
    }

    // Display All Students
    public void displayStudents() {

        if (students.isEmpty()) {

            System.out.println("No students available.");
            return;
        }

        System.out.println("\n========== STUDENT RECORDS ==========");

        for (Student s : students) {

            System.out.println("----------------------------------");
            System.out.println("Name       : " + s.getName());
            System.out.println("Maths      : " + s.getMaths());
            System.out.println("Physics    : " + s.getPhysics());
            System.out.println("Chemistry  : " + s.getChemistry());
            System.out.println("Total      : " + s.calculateTotal());
            System.out.println("Average    : " + s.calculateAverage());
            System.out.println("Grade      : " + s.calculateGrade());
        }

        System.out.println("----------------------------------");
    }

    // Search Student
    public void searchStudent(String name) {

        boolean found = false;

        for (Student s : students) {

            if (s.getName().equalsIgnoreCase(name)) {

                System.out.println("\nStudent Found!");
                System.out.println("----------------------------------");
                System.out.println("Name       : " + s.getName());
                System.out.println("Maths      : " + s.getMaths());
                System.out.println("Physics    : " + s.getPhysics());
                System.out.println("Chemistry  : " + s.getChemistry());
                System.out.println("Total      : " + s.calculateTotal());
                System.out.println("Average    : " + s.calculateAverage());
                System.out.println("Grade      : " + s.calculateGrade());

                found = true;
            }
        }

        if (!found) {

            System.out.println("Student not found.");
        }
    }

    // Sort Students by Total Marks
    public void sortStudentsByMarks() {

        Collections.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {

                return s2.calculateTotal() - s1.calculateTotal();
            }
        });

        System.out.println("Students sorted successfully!");
    }

    // Display Topper
    public void displayTopper() {

        if (students.isEmpty()) {

            System.out.println("No student data available.");
            return;
        }

        Student topper = students.get(0);

        for (Student s : students) {

            if (s.calculateTotal() > topper.calculateTotal()) {

                topper = s;
            }
        }

        System.out.println("\n========== CLASS TOPPER ==========");
        System.out.println("Name   : " + topper.getName());
        System.out.println("Total  : " + topper.calculateTotal());
        System.out.println("Grade  : " + topper.calculateGrade());
    }

    // Display Statistics
    public void displayStatistics() {

        if (students.isEmpty()) {

            System.out.println("No data available.");
            return;
        }

        int total = 0;

        for (Student s : students) {

            total += s.calculateTotal();
        }

        double average = total / (students.size() * 3.0);

        System.out.println("\n========== CLASS STATISTICS ==========");
        System.out.println("Total Students : " + students.size());
        System.out.println("Class Average  : " + average);
    }
}