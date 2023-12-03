import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

class sorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==1){
            int[] ar = new int[n];
            for (int i = 0; i < ar.length; ar[i++] = sc.nextInt());
            Arrays.sort(ar);
            
            //middle array exchanging content with last array
            int temp = ar[n - 1];
            ar[n - 1] = ar[(n - 1) / 2];
            ar[(n - 1) / 2] = temp;
            
            
            Integer[] arr1=new Integer[(n - 1) / 2];
            for (int i = ar.length - 1,j=0; i > (n - 1) / 2; i--,j++){
                arr1[j]=ar[i];
            }
            //descending order
            Arrays.sort(arr1, Collections.reverseOrder());
            
            System.out.println("\n\n");

            for (int i = 0; i < ar.length; i++){
                System.out.println(ar[i]);
            }
        }else{
            System.out.println("Input only positive odd numbers");
        }
        sc.close();
    }
}
