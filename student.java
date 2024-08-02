import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollno;
    String name;
    String course;
    
    Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }
    
    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name + ", Course: " + course;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("Roll No: ");
            int rollno = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Course: ");
            String course = scanner.nextLine();
            
            students.add(new Student(rollno, name, course));
        }
        
        System.out.println("Student Details:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
