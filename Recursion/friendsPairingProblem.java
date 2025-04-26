import java.util.Scanner;

public class friendsPairingProblem {

    public static int noOfWays(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return noOfWays(n-1) + (n-1) * noOfWays(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(noOfWays(n));
        sc.close();
    }
}
