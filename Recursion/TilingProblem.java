import java.util.Scanner;

public class TilingProblem {

    public static int numberOfWays(int n){
        if(n == 0 || n == 1){
            System.out.println("Way");
            return 1;
        }
        int vertical = numberOfWays(n-1);
        int horizontal = numberOfWays(n-2);
        return vertical + horizontal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(numberOfWays(n));
        sc.close();
    }
}
