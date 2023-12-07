import java.util.*;

class ArrayReverser {
    public static List<Integer> reverseArray(List<Integer> a) {
        Collections.reverse(a);
        return a;
    }
}

public class rev_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of integers
        int n = scanner.nextInt();

        // Create a list to store the integers
        List<Integer> arr = new ArrayList<>();

        // Read the integers and add them to the list
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr.add(num);
        }

        // Use the ArrayReverser class to reverse the array
        List<Integer> reversedArr = ArrayReverser.reverseArray(arr);

        // Print the reversed array
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
