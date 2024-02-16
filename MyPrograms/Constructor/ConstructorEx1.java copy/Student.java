package Constructor;

public class Student {
    private String name;
    private int roll;
    private int marks;

    /* Constructor */
    // Default Constructor
    public Student() {
        name = "No Name";
        roll = 0;
        marks = 0;
    }

    public Student(String name) {
        this.name = name;
        roll = 0;
        marks = 0;
    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        this.marks = 0;
    }

    public Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    // Setter methods
    // getter methods

    public void showStudent() {
        System.out.printf("\n%25s %10d %10d", name, roll, marks);
    }
}