import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Solution {
    
    public static ArrayList<Integer> slidingWindowMaximums(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        // finding maximum for first k window:
        for(int i = 0; i < k; i++) {
            // jitne bhi chote ya barabar hai saare remove krdo till k;
            while(!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }

        // first element ko store krlo:
        ans.add(arr[dq.getFirst()]);

        for(int i = k; i < arr.length; i++) {
            
            // pichle element ko remove krdo:
            if(!dq.isEmpty() && (i - dq.getFirst() >= k)) {
                dq.pollFirst();
            }
            
            // maximum nikalte kro till i from i-k
            while(!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) {
                dq.pollLast();
            }
            dq.addLast(i);

            // ans me daalte rho:
            ans.add(arr[dq.getFirst()]);
        }
        
        return ans;
    }

    public static ArrayList<Integer> slidingWindowMinimums(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        // finding minimum for first k window:
        for(int i = 0; i < k; i++) {
            // jitne bhi bade ya barabar hai saare remove krdo till k;
            while(!dq.isEmpty() && arr[dq.getLast()] >= arr[i]) {
                dq.pollLast();
            }
            dq.offer(i);
        }

        // first element ko store krlo:
        ans.add(arr[dq.getFirst()]);

        for(int i = k; i < arr.length; i++) {
            
            // pichle element ko remove krdo:
            if(!dq.isEmpty() && (i - dq.getFirst() >= k)) {
                dq.pollFirst();
            }
            
            // minimum nikalte kro till i from i-k
            while(!dq.isEmpty() && arr[dq.getLast()] >= arr[i]) {
                dq.pollLast();
            }
            dq.offer(i);

            // ans me daalte rho:
            ans.add(arr[dq.getFirst()]);
        }
        
        return ans;
    }

    public static int solve(int[] arr, int k) {
        List<Integer> maximums = slidingWindowMaximums(arr, k);
        List<Integer> minimums = slidingWindowMinimums(arr, k);
        int sum = 0;
        for(int i = 0; i < maximums.size(); i++) {
            sum += maximums.get(i) + minimums.get(i);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(solve(arr, k));

        sc.close();
    }
}
