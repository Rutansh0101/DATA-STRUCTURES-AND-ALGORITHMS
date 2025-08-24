public class ApowerB {

    static int power(int a, int b){
        if(b == 0)  return 1;
        return a * power(a, b-1);
    }
    public static void main(String[] args) {
        int a = 2, b = 10;
        System.out.println(power(a, b));
    }
}
