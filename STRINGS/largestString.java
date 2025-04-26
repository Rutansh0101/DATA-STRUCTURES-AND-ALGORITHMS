import java.util.Scanner;

public class largestString {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str1 = "apple";
        // String str2 = "mango";
        // String str3 = "banana";


        // // compareTo function is used to compare strings ny lexographical order:
        // System.out.println(str1.compareTo(str3));

        // // compareToIgnoreCase is used to compare without comparing lower and upper cases:
        // System.out.println(str1.compareToIgnoreCase(str3));

        String[] fruits = {"apple", "banana", "mango"};

        String largest = fruits[0];
        for(int i = 0; i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}
