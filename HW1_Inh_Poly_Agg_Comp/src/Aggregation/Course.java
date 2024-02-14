package Aggregation;

class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }
}

class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class Course {
    private String courseName;
    private Instructor instructor;
    private Instructor instructor2;
    private Textbook textbook;
    private Textbook textbook2;

    public Course(String courseName, Instructor instructor, Instructor instructor2,Textbook textbook, Textbook textbook2) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.instructor2 = instructor2;
        this.textbook = textbook;
        this.textbook2 = textbook2;
    }

    public void printInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor 1: " + instructor.getFullName() + ", Office: " + instructor.getOfficeNumber());
        System.out.println("Instructor 2: " + instructor2.getFullName() + ", Office: " + instructor2.getOfficeNumber());
        System.out.println("Textbook 1: " + textbook.getTitle() + " by " + textbook.getAuthor());
        System.out.println("Textbook 2: " + textbook2.getTitle() + " by " + textbook2.getAuthor());
    }

    public static void main(String[] args) {
        // Creating instructor and textbook objects
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("David", "Johanssen", "8-40");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides", "Addison-Wesley Professional");

        // Creating course object and printing information
        Course course1 = new Course("Software Engineering", instructor1, instructor2, textbook1, textbook2);
        course1.printInfo();
    }
}
