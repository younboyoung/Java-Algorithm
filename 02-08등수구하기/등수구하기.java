import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] answer = new int[n];
        int[] tmp = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }


        for(int i = 0; i < n; i++){
            int cnt = 1;
            for(int j = 0; j < n; j++){
                if(arr[i] < arr[j]){
                    cnt++;
                }
                answer[i] = cnt;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(answer[i] + " ");
        }

        return ;
    }
}