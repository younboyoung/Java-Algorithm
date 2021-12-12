import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < k - 1; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for(int rt = k-1; rt < n; rt++){
            hm.put(arr[rt], hm.getOrDefault(arr[rt], 0) + 1);
            answer.add(hm.size());
            hm.put(arr[lt], hm.get(arr[lt]) - 1);
            if(hm.get(arr[lt]) == 0) hm.remove(arr[lt]);
            lt++;
        }

        for(int i = 0; i < answer.size(); i++){
            System.out.print(answer.get(i) + " ");
        }
    }
}