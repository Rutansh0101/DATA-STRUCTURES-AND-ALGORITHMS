import java.util.ArrayList;
import java.util.Scanner;

public class MaxSubarraySum_BruteForce{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int subarrSum = 0;
            for(int j = i; j < n; j++){
                subarrSum += list.get(j);
                max = (max > subarrSum) ? max : subarrSum;
            }
        }
        System.out.println(max);
        sc.close();
    }
}