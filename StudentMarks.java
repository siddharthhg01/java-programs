import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
    int grade;

    // You can add additional methods here if needed
}

class Student {
    String name;
    String usn;
    double SGPA;
    Scanner s;
    Subject[] subjects;

    Student() {
        int i;
        subjects = new Subject[8]; // Assuming 8 subjects
        for (i = 0; i < 8; i++)
            subjects[i] = new Subject();
        s = new Scanner(System.in);
    }

    void getStudentDetails() {
        System.out.print("Enter Name: ");
        name = s.nextLine();
        System.out.print("Enter USN: ");
        usn = s.nextLine();
    }

    void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter details for Subject " + (i + 1));
            System.out.print("Enter Marks: ");
            subjects[i].subjectMarks = s.nextInt();
            System.out.print("Enter Credits: ");
            subjects[i].credits = s.nextInt();

            // Calculate grade based on conditions
            if (subjects[i].subjectMarks >= 90)
                subjects[i].grade = 10;
            else if (subjects[i].subjectMarks >= 80)
                subjects[i].grade = 9;
            else if (subjects[i].subjectMarks >= 70)
                subjects[i].grade = 8;
            else if (subjects[i].subjectMarks >= 60)
                subjects[i].grade = 7;
            else if (subjects[i].subjectMarks >= 50)
                subjects[i].grade = 6;
            else if (subjects[i].subjectMarks >= 40)
                subjects[i].grade = 5;
            else
                subjects[i].grade = 0; // Fail
        }
    }

    void computeSGPA() {
        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 0; i < 8; i++) {
            totalCredits += subjects[i].credits;
            totalGradePoints += subjects[i].credits * subjects[i].grade;
        }

        SGPA = totalGradePoints / totalCredits;
    }

    void displayResult() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("SGPA: " + SGPA);
    }
}

public class StudentMarks{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getStudentDetails();
        s1.getMarks();
        s1.computeSGPA();
        s1.displayResult();
    }
}
