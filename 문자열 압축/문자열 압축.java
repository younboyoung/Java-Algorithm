import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        str = str + " ";
        char[] s = str.toCharArray();

        String answer = "";
        int count = 1;
        for(int i = 0; i < s.length-1; i++){
            if(s[i] != s[i+1]){
                answer = answer + String.valueOf(s[i]);
                if(count > 1) answer = answer + String.valueOf(count);
                count = 1;
            }else{
                count++;
            }
        }

        System.out.println(answer);
        return ;
    }
}