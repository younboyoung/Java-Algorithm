import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n1 = in.nextInt();
        ArrayList<Integer> answer = new ArrayList<>();

        int[] arr1 = new int[n1];
        for(int i = 0; i<n1; i++){
            arr1[i] = in.nextInt();
        }

        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i<n2; i++){
            arr2[i] = in.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;
        while(p1 < n1 && p2 < n2){
            if(arr1[p1] == arr2[p2]){
                answer.add(arr1[p1]);
                p1++; p2++;
            } else if(arr1[p1] > arr2[p2]) { p2++; }
            else if(arr1[p1] < arr2[p2]) { p1++; }

        }

        for(int i : answer){
            System.out.print(i + " ");
        }

        return ;
    }
}