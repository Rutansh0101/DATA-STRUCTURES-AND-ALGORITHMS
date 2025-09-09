import java.util.*;
class Stack{

    ArrayList<Character> arr;
    
    public Stack(){
        arr = new ArrayList<>();
    }
    
    public void push(char data){
        arr.add(data);
        return;
    }

    public void pop(){
        arr.remove(arr.size()-1);
        return;
    }

    public char peek(){
        return arr.get(arr.size()-1);
    }

    public boolean isEmpty(){
        return arr.size() == 0;
    }

}

public class validParenthesis{

    public static boolean checkValidParenthesis(String str){
        Stack s1 = new Stack();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '[' || str.charAt(i) == '(' || str.charAt(i) == '{'){
                s1.push(str.charAt(i));
            }
            else{
                if(s1.isEmpty()){
                    return false;
                }
                if(s1.peek() == '[' && str.charAt(i) == ']'){
                    s1.pop();
                }
                else if(s1.peek() == '(' && str.charAt(i) == ')'){
                    s1.pop();
                }
                else if(s1.peek() == '{' && str.charAt(i) == '}'){
                    s1.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s1.isEmpty())
        return true;
        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();

        if(checkValidParenthesis(str)){
            System.out.println("is valid parenthesis.");
        } else{
            System.out.println("is not valid parenthesis.");
        }

        sc.close();
    }
}