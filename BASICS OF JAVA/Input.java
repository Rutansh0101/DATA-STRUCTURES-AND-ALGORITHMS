import java.util.*;

public class Input {
    public static void main(String[] args){
        // making an object named sc of class Scanner of type input;
        Scanner sc = new Scanner(System.in);
//        // taking input from user and storing it in input variable:
//        // next function of stores the input until a space or next line occurs,
//        // String input = sc.next(); // next function is used to capture input;
//        // to fix that we have to use nextLine() function
//        String input = sc.nextLine();
//        // printing the taken input:
//        System.out.println(input);

//        // to take input of int, we can use nextInt:
//        int number = sc.nextInt();
//        System.out.println(number);

//        // float input:
//        float price = sc.nextFloat();
//        System.out.println(price);

        // similarly add name of type after next for all the remaining types.
//        // boolean:
//        boolean b = sc.nextBoolean();
//        System.out.println(b);

//        // short:
//        short s = sc.nextShort();
//        System.out.println(s);

        // Long:
        long l = sc.nextLong();
        System.out.println(l);

        sc.close();
    }
}