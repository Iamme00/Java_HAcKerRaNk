import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class is_prime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger bg= new BigInteger(n);
        //certainty:1 --> True then its probability is 100%
        //certainty:0 --> True meaning has no real evidence to say it is right or wrong
        //certainty : -1 --> True then has high evidence the value is wrong or different
        if(bg.isProbablePrime(1)==true){
            System.out.println("Prime");
        }else{
            System.out.println("not prime");
        }
    }
}
