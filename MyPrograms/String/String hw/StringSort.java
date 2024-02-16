import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] studentNames = new String[10];

        // Accept names from the user
        System.out.println("Enter the names of 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
        }

        Arrays.sort(studentNames);

        System.out.println("\nNames of students in Sorted order:");

        for (String name : studentNames) {
            System.out.println(name);
        }

    }
}
