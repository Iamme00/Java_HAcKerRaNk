import java.util.*;

public class stringcap{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String A=scanner.next();
        String B=scanner.next();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String[] ab = {A,B};
        for(int i=0;i<ab.length;i++){
            ab[i]=ab[i].substring(0,1).toUpperCase()+ab[i].substring(1);
        }
        System.out.println(ab[0]+" "+ab[1]);
        scanner.close();
    }
}



