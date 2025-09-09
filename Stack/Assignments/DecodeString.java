class Solution {
    public String decodeString(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<String> words = new Stack<>();
        String word = "", number = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                number += ch;
            }
            else if(ch == '['){
                numbers.push(Integer.valueOf(number));
                words.push(word);
                number = "";
                word = "";
            }
            else if(ch == ']'){
                StringBuilder decoded = new StringBuilder(words.pop());
                int n = numbers.pop();
                for(int j = 0; j < n; j++){
                    decoded.append(word);
                }
                word = decoded.toString();
            }
            else{
                word += ch;
            }
        }
        return word;
    }
}
