import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            else if(x == ')') stack.pop();
            else {
                if(stack.isEmpty()) answer += x;
            }
        }
        System.out.println(answer);
        return ;
    }
}