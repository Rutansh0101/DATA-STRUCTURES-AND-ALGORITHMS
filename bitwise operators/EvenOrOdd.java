import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n&1) == 1){
            System.out.println("ODD");
        }
        else{
            System.out.println("EVEN");
        }
    }
}
