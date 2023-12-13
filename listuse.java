import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class listuse {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        int init = Integer.parseInt(sc.next());

        for (int i = 0; i < init; i++) {
            list.add(sc.nextInt());
        }
        int b = Integer.parseInt(sc.next());
        for(int i = 0; i < b; i++){
            String str = sc.next();
            if (str.equals("Insert")) {
                int ins = sc.nextInt();
                list.add(ins, sc.nextInt());
            } else if (str.equals("Delete")) {
                list.remove(sc.nextInt());
            }
            sc.nextLine();  // Consume the newline character
        }
        for(int a:list){
            System.out.print(a+" ");
        }
    }
}
