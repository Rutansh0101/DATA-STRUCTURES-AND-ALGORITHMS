import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryNumbersFrom1toN{
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();
        q1.add("1");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            String s1 = q1.remove();
            System.out.print(s1 + " ");
            q1.add(s1 + "0");
            q1.add(s1 + "1");
            n--;
        }
        
        sc.close();
    }
}