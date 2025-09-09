import java.util.Scanner;

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int palindrome = 1;
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                palindrome = 0;
            }
        }

        if(palindrome == 1){
            System.out.println("String is Palindrome.");
        }
        else{
            System.out.println("String is not Palindrome.");
        }
    }
}
