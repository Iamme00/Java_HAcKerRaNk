import java.math.BigDecimal;
import java.util.Scanner;

public class bigdecimal {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];

        // Read input values
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        // Perform bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                BigDecimal bd1 = new BigDecimal(s[j]);
                BigDecimal bd2 = new BigDecimal(s[j + 1]);

                if (bd1.compareTo(bd2) == -1) {
                    // Swap if the current element is smaller than the next element
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
        sc.close();
    }
}
