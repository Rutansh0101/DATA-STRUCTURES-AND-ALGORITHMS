import java.util.Scanner;

public class fastExpo {
    
    public static int fastExponential(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) == 1){
                ans *= a;
            }
            a *= a;
            n = n >> 1;
        }
        return ans;
    };


    public static void main(String[] args) {
        System.out.println(fastExponential(3, 5));
    }
}
