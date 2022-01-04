import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char back = 'a';

        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            else if(x == ')'){
                if(back == '(') {
                    stack.pop();
                    answer += stack.size();
                }
                else if(back == ')') {
                    answer += 1;
                    stack.pop();
                }
            }
            back = x;
        }

        System.out.println(answer);
        return ;
    }
}