import java.util.*;

public class Strsplit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] a= s.split("[ .@?,'_!]+");
        scan.close();
        System.out.println(a.length);
        for(String i:a){
            System.out.println(i);
        }
    }
}

