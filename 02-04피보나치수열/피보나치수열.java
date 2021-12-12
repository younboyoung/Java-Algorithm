import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        return ;
    }
}