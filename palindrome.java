import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder B = new StringBuilder();
        B.append(A);
        B.reverse();
        String C=B.toString();
        if(A.equals(C)){
            System.out.print("Yes");
        }
        sc.close();
    }
}



