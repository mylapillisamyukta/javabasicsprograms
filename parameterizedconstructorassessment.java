package exceptionassessment;
import java.util.Scanner;

		class AgeNotWithinRangeException extends Exception {
		    public AgeNotWithinRangeException(String message) {
		        super(message);
		    }
		}

		class NameNotValidException extends Exception {
		    public NameNotValidException(String message) {
		        super(message);
		    }
		}

		// Student class
		class Student {
		    private int rollno;
		    private String name;
		    private int age;
		    private String course;

		    // Parameterized constructor
		    public Student(int rollno, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
		        if (age < 15 || age > 21) {
		            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
		        }
		        if (!name.matches("^[a-zA-Z ]+$")) {
		            throw new NameNotValidException("Name should contain only letters and spaces");
		        }

		        this.rollno = rollno;
		        this.name = name;
		        this.age = age;
		        this.course = course;
		    }

		    // Method to display student details
		    public void show() {
		        System.out.println("Roll No: " + rollno);
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("Course: " + course);
		    }
		}

		// Driver class
		public class parameterizedconstructorassessment {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter Roll No:");
		        int rollno = sc.nextInt();
		        sc.nextLine(); 
		        System.out.println("Enter Name:");
		        String name = sc.nextLine();
		        System.out.println("Enter Age:");
		        int age = sc.nextInt();
		        sc.nextLine();
		        System.out.println("Enter Course:");
		        String course = sc.nextLine();

		        // Creating Student object
		        try {
		            Student student = new Student(rollno, name, age, course);
		            student.show();
		        } catch (AgeNotWithinRangeException e) {
		            System.out.println("Error: " + e.getMessage());
		        } catch (NameNotValidException e) {
		            System.out.println("Error: " + e.getMessage());
		        }
	}

}
