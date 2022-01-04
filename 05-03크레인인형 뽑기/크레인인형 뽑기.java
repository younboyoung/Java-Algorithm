import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = in.nextInt();
            }
        }

        int m = in.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i<n; i++){
            moves[i] = in.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        for(int x=0; x<m; x++){
            for(int i=0; i<n; i++){
                if(board[i][moves[x]-1] != 0){
                    if(!stack.isEmpty() && stack.peek() == board[i][moves[x]-1]){
                        stack.pop();
                        count += 2;
                    }
                    else stack.push(board[i][moves[x]-1]);
                    board[i][moves[x]-1] = 0;
                    break;
                }
            }
        }

        System.out.println(count);
        return ;
    }
}