import java.util.Scanner;

public class javaloopII{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] a = new int[q];
        int[] b = new int[q];
        int[] n = new int[q];
        
        for (int k = 0; k < q; k++) {
            a[k] = sc.nextInt();
            b[k] = sc.nextInt();
            n[k] = sc.nextInt();
            int[] d = new int[n[k]];
            int z = 2;
            d[0] = a[k] + b[k];
            for (int i = 1; i < n[k]; i++) {
                d[i] = d[i - 1] + z * b[k];
                z = z * 2;
            }
            for (int j = 0; j < n[k]; j++) {
                System.out.print(d[j] + " ");
            }
    }
    sc.close();
}
}