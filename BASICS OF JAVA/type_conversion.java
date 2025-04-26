public class type_conversion {
    public static void main(String[] args){
        int a = 25;
        long b = a;
        System.out.println(b);
//        the type we are converting into should be greater than the type we are currently using.
        // for an example, int can be converted into long (4 < 8)bytes
        // but, long can not be converted into int (8 > 4)bytes, it is a lossy conversion.

        // Here is the chain:
//        byte -> short -> int -> float -> long -> double.
        // These are called implicit conversions as these are done automatically.
    }
}