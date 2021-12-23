import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String S = in.next();
        String T = in.next();
        int cnt = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : T.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int lt = 0, rt = T.length() - 1;
        String answer;
        for(int i=0; i < S.length() - T.length() + 1; i++){
            answer = "YES";
            String sub = S.substring(i, i + T.length());
            for(char x : sub.toCharArray()){
                if(map.get(x) == 0 || !map.containsKey(x)) answer = "NO";
            }
            if(answer == "YES") cnt++;
        }

        System.out.println(cnt);
        return ;
    }
}