import java.util.Scanner;

public class analgram {
    static boolean isAnagram(String a, String b) {
        String C = a.toLowerCase();
        String D = b.toLowerCase();
        char[] chr = C.toCharArray();
        char[] cha = D.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            for (int j = i + 1; j < chr.length; j++) {
                if (chr[i] > chr[j]) {
                    char temp = chr[i];
                    chr[i] = chr[j];
                    chr[j] = temp;
                }
            }
        }
        for (int i = 0; i < cha.length; i++) {
            for (int j = i + 1; j < cha.length; j++) {
                if (cha[i] > cha[j]) {
                    char temp = cha[i];
                    cha[i] = cha[j];
                    cha[j] = temp;
                }
            }
        }
        String A = new String(chr);
        String B = new String(cha);
        return A.equals(B);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
