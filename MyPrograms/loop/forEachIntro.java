package MyPrograms.loop;

public public class ForEachExample {
    public static void main(String arhs[]) {
        int arr[] = { 10, 15, 20, 25, 30, 35, 40, 45, 55 };
        int arr1[] = new int[20];

        System.out.print("\nLength of arr=" + arr.length);
        System.out.print("\nLength of arr1=" + arr1.length);

        // Traversal of array
        // way 1:
        System.out.print("Contents of arr=");
        for (int i = 0; i < 9; i++) {
            System.out.print("\narr[" + i + "]=" + arr[i]);
        }
        // way 2:
        System.out.print("\nContents of arr1=");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("\narr1[" + i + "]=" + arr1[i]);
        }

        // way 3: for each version of for
        System.out.print("\n\nAgain contents of arr=");
        for (int data : arr) {
            System.out.print("\n" + data);
        }

        System.out.println("\nAgain contents of arr1=");
        for (int data : arr1) {
            System.out.println(data);
        }

        // to print index number
        System.out.println("\n Contents of arr1 (using for each version with index number)");
        int i = 0;
        for (int data : arr1) {
            System.out.println("arr1[" + i + "]" + data);
            i++;
        }

        String friends[] = { "Anshu Mala", 
        "Neha Kumari", "Kajal Kumari", "Rahul Kumar", "Ankit Kumar", "Manish Kumar",
                "Rakesh Raj" };
        System.out.println("\nAll friends=");
        for (String name : friends) {
            System.out.println(name);
        }
        System.out.println("\nAll friends=");
        i = 1;
        for (String name : friends) {
            System.out.println(i + ". " + name);
            i++;
        }

    }
}
/*
 * for each version of for
 * ----------------------------
 * for(datatype varName:arrayName)
 * {
 * process varName
 * }
 * Note: varName is not index number. It is value in array.
 */
/*
 * Write a Java program that will accept n names from user and print all entered
 * names.
 */ {
    
}
