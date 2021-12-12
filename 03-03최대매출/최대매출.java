import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int answer = 0, sum = 0;
        for(int i=0; i<k; i++) sum += arr[i];
        answer = sum;
        for(int i=k; i<n; i++){
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
        return ;
    }
}