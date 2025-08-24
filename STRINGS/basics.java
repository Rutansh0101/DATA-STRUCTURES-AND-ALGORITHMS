import java.util.*;

public class basics {
    public static void main(String[] args) {
        // // declaration and definition:
        // String s1 = "Rutansh";
        // String s2 = new String("Chawla");
        // System.out.println(s1 + " " + s2);

        // Strings are IMMUTABLE:

        // // input of whole string:
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);


        // // length of string:
        // System.out.println(name.length());

        // concat:
        String firstName = "Rutansh";
        String lastName = "Chawla";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // sc.close();


        // iteration on string:
        for(int i = 0; i < fullName.length(); i++){
            System.out.print(fullName.charAt(i) + " ");
        }
    }
}