import java.util.Scanner;

public class range_of_primes {

    public static boolean isprime(int input){
        boolean isPrime = true;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            if(isprime(i)){
                System.out.println("Number is prime = " + i);
            }
        }

        sc.close();
    }
}
