class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(currentChar);
            }
            else{
                if(stack.peek() == currentChar){
                    stack.pop();
                }
                else{
                    stack.push(currentChar);
                }
            }
        }

        StringBuilder ans = new StringBuilder("");
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}
