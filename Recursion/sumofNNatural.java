public class sumofNNatural {
    
    public static int sumofNNaturalNo(int n){
        if(n == 0){
            return 0;
        }
        return n + sumofNNaturalNo(n-1);
    }
    
    public static void main(String[] args) {
        System.out.println(sumofNNaturalNo(10));
    }
}
