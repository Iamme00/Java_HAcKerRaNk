import java.util.*;

public class arrylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int[] ary=new int[a];
        // int[] ary1;
        
        // for(int i=0;i<a;i++){
        //     ary[i]=sc.nextInt();
        //     ary1=new int[ary[i]];
        //    for(int j=0;j<ary1.length;j++){
        //     ary1[j]=sc.nextInt();
        //    }
        // }
        // int pos =sc.nextInt();
        // for(int i=0;i<pos;i++){
            
        // }
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int ttl = sc.nextInt();
            list1.add(ttl);
            for (int j = 0; j < ttl; j++) {
                list2.add(sc.nextInt());
            }
        }
        int pos = sc.nextInt();
        for(int i=0;i<pos;i++){
            
        }
    }
}
