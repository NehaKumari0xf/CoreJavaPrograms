public class Student {
    private String name;
    private int roll;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public int getMarks() {
        return marks;
    }

    public void show() {
        System.out.printf("\nName:%30s, Roll:%5d, Marks:%5d" ,name ,roll ,marks);
    }
}