import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int S = in.nextInt();
        int T = in.nextInt();
        int cnt = 0;

        HashMap<Integer, Integer> am = new HashMap<>();
        for(char x : T.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int lt = 0, rt = T.length() - 1;

        for(int i=0; i < S.length() - T.length() + 1; i++){
            String sub = S.substring(i, i + T.length());
            for(char x : sub.toCharArray()){
                if(map.get(x) == 0 || !map.contains(x)) break;
            }
        }

        System.out.println(cnt);
        return ;
    }
}