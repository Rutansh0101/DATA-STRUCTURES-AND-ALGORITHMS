class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch == 'a'){
                stack.push(ch);
            }
            else if(ch == 'b'){
                if(stack.isEmpty() || stack.peek() != 'a') return false;
                else    stack.push(ch);
            }
            else{
                if(stack.size() < 2)    return false;
                char b = stack.pop();
                char a = stack.pop();
                if(a == 'a' && b == 'b'){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
