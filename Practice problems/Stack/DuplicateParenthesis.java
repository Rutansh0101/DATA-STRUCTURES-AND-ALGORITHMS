import java.util.*;

public class DuplicateParenthesis {

    public static boolean containsDuplicateParenthesis(String s){
        Stack stack = new Stack();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')'){
                boolean content = false;
                while(!stack.isEmpty() && stack.peek() != (Character)'('){
                    stack.pop();
                    content = true;
                }
                if(content == false)    return true;
                if(stack.isEmpty()) return false;
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if(containsDuplicateParenthesis(s)){
            System.out.println("It contains duplicate parenthesis.");
        }
        else{
            System.out.println("It doesn't contains any duplicate parenthesis.");
        }
        sc.close();
    }
}
