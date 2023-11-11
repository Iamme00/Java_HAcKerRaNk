import java.util.*;
import java.text.*;

public class currencynumfrm {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String us = nf.getCurrencyInstance(Locale.US).format(payment);
        String india = nf.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = nf.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = nf.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        scanner.close();
    }
}