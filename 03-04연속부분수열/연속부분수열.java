import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int cnt = 0;

        for(int i=1; i<=m; i++){
            int sum = 0;
            for(int j=0; j<i; j++){
                sum += arr[j];
            }
            if(sum == m) cnt++;

            for(int j=0; j<n-i+1; j++){
                sum -= arr[j];
                sum += arr[j+i];
                if(sum == m) cnt++;
            }
        }
        System.out.println(cnt);
    }
}