import java.util.HashMap;
import java.util.Map;

public class mostFreqElement{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,3,4,3,2,3,1,1,3,4,43,2,4};

        Map<Integer, Integer> m1 = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(!m1.containsKey(arr[i])){
                m1.put(arr[i], 1);
            }
            else{
                m1.put(arr[i], m1.get(arr[i]) + 1);
            }
        }
        int max = 0;
        int ans = 0;
        for(var i : m1.entrySet()){
            if(max < i.getValue()){
                max = i.getValue();
                ans = i.getKey();
            }
        }
        System.out.println(m1);
        System.out.println(ans);
    }
}