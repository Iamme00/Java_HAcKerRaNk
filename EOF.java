import java.util.Scanner;

public class EOF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(sc.hasNext()){
            num++;
            System.out.printf("%d %s\n",num,sc.nextLine());
        }
    }
}
