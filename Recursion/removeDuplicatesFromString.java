public class removeDuplicatesFromString {
    
    public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean[] map){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str, index+1, newStr, map);
        }   else{
            newStr.append(currChar);
            map[currChar - 'a'] = true;
            removeDuplicates(str, index+1, newStr, map);
        }
    }
    
    public static void main(String[] args) {
        removeDuplicates("rutanshchawla", 0, new StringBuilder(), new boolean[26]);
    }
}