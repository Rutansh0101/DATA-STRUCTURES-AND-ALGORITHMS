import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        if(((n-1) & n) == 0){
            System.out.println("It is the power of 2");
        } else{
            System.out.println("It is not a power of 2");
        }
    }
}
