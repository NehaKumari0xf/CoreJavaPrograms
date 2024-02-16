import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArr = new String[25];

        System.out.println("Enter 25 different strings:");
        for (int i = 0; i < 25; i++) {
            System.out.print("String " + (i + 1) + ": ");
            strArr[i] = sc.nextLine();
        }

        System.out.print("\nEnter a string to search: ");
        String searchString = sc.nextLine();

        boolean found = false;
        for (String str : strArr) {
            if (str.equals(searchString)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The entered string is present in the array.");
        } else {
            System.out.println("Sorry...The entered string is not present in the array.");
        }
    }
}
