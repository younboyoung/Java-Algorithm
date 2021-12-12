import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] ch = new int[n+1];
        int answer = 0;
        for(int i = 2; i <= n; i++){
            if(ch[i] == 0){
                answer++;
                for(int j = i; j <= n; j=j+i){
                    ch[j] = 1;
                }
            }
        }
        System.out.print(answer);
        return ;
    }
}