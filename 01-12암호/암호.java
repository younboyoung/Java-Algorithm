import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();

        String answer="";
        for(int i = 0; i<n; i++){
            String tmp = str.substring(0, 7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            str = str.substring(7);
        }

        System.out.println(answer);
        return ;
    }
}