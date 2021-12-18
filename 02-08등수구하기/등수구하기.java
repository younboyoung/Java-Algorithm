import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        int[] tmp = new int[n];
        int[] answer = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            tmp[i] = in.nextInt();
        }

        Arrays.sort(tmp);
        for(int i = 0; i < n; i++){
            int cnt = 1;
            for(int j = 0; j < n; j++){
                if(arr[i] == tmp[j]){
                    answer[i] = cnt;
                }else{
                    cnt+=1;
                }
            }
        }
        for(int n : answer){
            System.out.print(n + " ");
        }
    }
}