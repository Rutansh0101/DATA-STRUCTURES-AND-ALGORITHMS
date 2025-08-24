public class factorial {
    
    public static int factorialOfN(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorialOfN(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorialOfN(5));
    }
}
