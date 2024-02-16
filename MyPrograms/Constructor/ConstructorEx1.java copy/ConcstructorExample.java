package Constructor;

public class ConstructorExample {
    public static void main(String[] args) {
        Student s1 = new Student();// default constructor
        Student kajal = new Student("Kajal");
        Student rahul = new Student("Rahul Kumar", 45);
        Student neha = new Student("Neha Kumari", 10, 89);

        s1.showStudent();
        kajal.showStudent();
        rahul.showStudent();
        neha.showStudent();
    }
}
