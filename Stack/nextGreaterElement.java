import java.util.*;

public class nextGreaterElement {
    public static  ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack stack = new Stack();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = arr.length-1; i >= 0; i--){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                arr[i] = -1;
                continue;
            }
            
            while(!stack.isEmpty() && arr[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(arr[i]);
                arr[i] = -1;
                continue;
            }
            if(arr[i] < stack.peek()){
                int temp = arr[i];
                arr[i] = stack.peek();
                stack.push(temp);
            }
        }
        
        for(int i:arr){
            ans.add(i);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 5, 1};
        ArrayList<Integer> ans = nextLargerElement(arr);
        
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}