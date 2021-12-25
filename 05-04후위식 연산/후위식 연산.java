import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == '+'){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b+a);
            }
            else if(x == '-'){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }
            else if(x == '*'){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b*a);
            }
            else if(x == '/'){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
            else {
                stack.push(Character.getNumericValue(x));
            }
        }

        System.out.println(stack.pop());
        return ;
    }
}