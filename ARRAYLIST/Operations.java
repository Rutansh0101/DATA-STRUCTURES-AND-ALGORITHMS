import java.util.ArrayList;
import java.util.Collections;

public class Operations {
    public static void main(String[] args) {
        // initializing arraylist or declaring arraylist:
        ArrayList<Integer> list = new ArrayList<>();
        
        // to add one element,  it takes O(1) time;
        list.add(1); // one added to the list;
        list.add(2); // two added to the list;
        list.add(3); // three added to the list;
        list.add(4); // four added to the list;

        // to print the list, we dont even have to use loop, just simply print it:
        System.out.println(list);


        // to get or access any element in ArrayList, we use get function:
        System.out.println(list.get(2)); // it will print the element present on index 2;
        // it is also done in constant time ie: O(1);


        // to delete any element just use remove function, it takes O(n) time ie linear:
        list.remove(2); // removing the element present at index-2;
        System.out.println(list);


        // to update the value at any index, just use set function, it also takes O(n) time:
        list.set(0, 10); // here 0th indexed element will be replaced by the 10;
        System.out.println(list);


        // to check if there exists any element in the list, we use contain function:
        boolean index = list.contains(10); // it will return true if the input element exists else returns false;
        System.out.println(index);



        // if we want to insert any value on the given index, we use add function:
        list.add(0, 1); // it will insert 1 on 0th index;
        System.out.println(list); // it takes linear time to perform;


        // size of an ArrayList:
        System.out.println(list.size());


        // iterating the ArrayList:
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        // to sort an ArrayList:
        Collections.sort(list);
        System.out.println(list);


        // if we wanna sort the ArrayList in descending order:
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
