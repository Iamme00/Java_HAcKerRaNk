import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int c[] = new int[100];
        a[1] = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1, j = 1; j <= n; i = i * 2, j++) {
            c[j] = (i * b);
            a[j + 1] = a[j] + c[j];
        }
        for (int j = 1; j < n; j++) {
            System.out.print(a[j] + " ");
        }
        sc.close();
    }
}
