import java.util.*;
import java.util.Stack;

public class palindromeLinkedList {

    public static boolean checkPalindrome(LinkedList<Integer> ll){
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < ll.size(); i++){
            if(ll.get(i) != ll.get(ll.size() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(1);
        
        if(checkPalindrome(ll)){
            System.out.println("Palindrome.");
        } else{
            System.out.println("Not Palindrome.");
        }
    }
}
