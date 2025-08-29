class Solution {
    public int countMinReversals(String s) {
        // code here
        if((s.length() & 1) == 1) return -1;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{') {
                stack.push('{');
            }
            else {
                if(stack.isEmpty()) {
                    stack.push('}');
                }
                else {
                    if(stack.peek() == '{') {
                        stack.pop();
                    }
                    else {
                        stack.push('}');
                    }
                }
            }
        }

        int ans = 0;

        while(!stack.isEmpty()) {
            char b = stack.pop();
            char a = stack.pop();
            if(a == '}' && b == '{') {
                ans += 2;
            }
            else {
                ans += 1;
            }
        }
        return ans;
    }
}
