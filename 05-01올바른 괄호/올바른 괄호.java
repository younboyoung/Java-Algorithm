import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x=='(') stack.push(x);
            else{
                if(stack.isEmpty()) answer = "NO";
                stack.pop();
            }
        }
        System.out.println(answer);
        return ;
    }
}