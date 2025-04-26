public class LengthOfString {
    
    public static void findLength(String str, int i){
        if(i == str.length()){
            System.out.println(i);
            return;
        }
        findLength(str, i+1);
        return;
    }

    public static void main(String[] args) {
        findLength("Rutansh", 0);
    }
}
