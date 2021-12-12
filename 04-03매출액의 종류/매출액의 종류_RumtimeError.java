import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        int[] answer = new int[n - k + 1];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < n - k + 1; i++){
            Map<Integer, Integer> hm = new HashMap<>();
            for(int j = i; j < i + k; j++){
                hm.put(arr[j],hm.getOrDefault(arr[j], 0) + 1);
            }
            answer[i] = hm.size();
        }

        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i] + " ");
        }
    }
}