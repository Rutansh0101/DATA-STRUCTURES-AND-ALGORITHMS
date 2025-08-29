import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        for(String s:path.split("/")){
            if(s.length() != 0){
                if(s.equals(".")){
                    continue;
                }
                if(!stack.isEmpty() && s.equals("..")){
                    stack.pop();
                    continue;
                }
                else if(stack.isEmpty() && s.equals(".."))  continue;
                stack.push(s);
            }
        }
        if(stack.isEmpty()) return "/";

        StringBuilder ans = new StringBuilder("");
        while(!stack.isEmpty()){
            ans.insert(0, "/" + stack.pop());
        }

        return ans.toString();
    }
}