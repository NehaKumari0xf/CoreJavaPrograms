public class StudentRecord {
    public static void main(String[] args) {
        // create object of Student class
        Student neha = new Student();
        Student rahul = new Student();
        neha.show();
        rahul.show();
        neha.setName("Neha Kumari");
        neha.setRoll(30);
        neha.setMarks(67);

        rahul.setName("Rahul Kumar");
        rahul.setRoll(20);
        rahul.setMarks(neha.getMarks());
        neha.show();
        rahul.show();
    }
}
