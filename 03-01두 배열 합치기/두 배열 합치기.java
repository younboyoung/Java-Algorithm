import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = in.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m){
            if(a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);

        for(int i = 0; i < n+m; i++){
            System.out.print(answer.get(i) + " " );
        }
        return ;
    }
}