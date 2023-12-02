import java.util.*;
public class inttostring {
 public static void main(String[] args) {
  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
    String s = Integer.toString(n);
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   }
  } catch (Exception e) {
   System.out.println("Please enter valid input");
  }
 }
}
