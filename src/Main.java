import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println("\n=====================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("=====================================");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Sort Students by Marks");
            System.out.println("5. Display Topper");
            System.out.println("6. Display Statistics");
            System.out.println("7. Exit");
            System.out.println("=====================================");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Maths Marks: ");
                    int maths = sc.nextInt();

                    System.out.print("Enter Physics Marks: ");
                    int physics = sc.nextInt();

                    System.out.print("Enter Chemistry Marks: ");
                    int chemistry = sc.nextInt();

                    sc.nextLine();

                    Student student =
                            new Student(name, maths, physics, chemistry);

                    manager.addStudent(student);

                    break;

                case 2:

                    manager.displayStudents();

                    break;

                case 3:

                    System.out.print("Enter student name to search: ");
                    String searchName = sc.nextLine();

                    manager.searchStudent(searchName);

                    break;

                case 4:

                    manager.sortStudentsByMarks();

                    break;

                case 5:

                    manager.displayTopper();

                    break;

                case 6:

                    manager.displayStatistics();

                    break;

                case 7:

                    System.out.println("Program terminated.");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}