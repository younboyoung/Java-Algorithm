import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int max = 0;
        int sum;
        for(int i = 0; i < n; i++){
            sum = 0;
            for(int j = 0; j < n; j++){
                sum += arr[i][j];
            }
            if(sum > max) max = sum;
        }

        for(int i = 0; i < n; i++){
            sum = 0;
            for(int j = 0; j < n; j++){
                sum += arr[j][i];
            }
            if(sum > max) max = sum;
        }

        sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i][n-i-1];
        }
        if(sum > max) max = sum;

        sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i][i];
        }
        if(sum > max) max = sum;

        System.out.println(max);
        return ;
    }
}