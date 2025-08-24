import java.util.HashMap;
import java.util.Map;

public class hashMap{
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Rutansh");
        map.put(2, "Nizza");

        // System.out.println(map);
        // System.out.println(map.get(2));
        // System.out.println(map.containsKey(2));
        // System.out.println(map.containsValue("Rutansh"));

        // // iterating over keys of a map:
        // for(Integer i:map.keySet()){
        //     System.out.println(i);
        // }
        // // iterating over values of a map:
        // for(String i:map.values()){
        //     System.out.println(i);
        // }
        // iterating over mapping of keys & values of a map:
        for(var i:map.entrySet()){
            System.out.println(i.getKey() + " => " + i.getValue());
        }
    }
}