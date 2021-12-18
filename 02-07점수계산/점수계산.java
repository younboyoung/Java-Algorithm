import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int[] answer = new int[n];

        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                cnt += 1;
                answer[i] = cnt;
            }else{
                cnt = 0;
                answer[i] = cnt;
            }
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += answer[i];
        }

        System.out.println(sum);
    }
}