import java.io.*;



public class multtable{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1;i<=10;i++){
            System.out.printf("%2d * %02d = %02d\n",N,i,(N*i));
        }
        bufferedReader.close();
    }
}
