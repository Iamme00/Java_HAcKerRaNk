import java.util.*;
import java.math.*;

public class bgintger{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger a= sc.nextBigInteger();
        BigInteger b= sc.nextBigInteger();
        System.out.print(a.add(b)+"\n"+a.multiply(b));
        sc.close();
    }
}