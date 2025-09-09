import java.util.Scanner;

public class operations {

    public static int getIthPosition(int n, int position){
        int bit = n >> position;
        return bit&1;
    }

    public static int setIthBit(int n, int position){
        int bitMask = 1 << position;
        n = n | bitMask;
        return n;
    }


    public static int clearIthBit(int n, int position){
        int bitMask = 1 << position;
        n = n ^ bitMask;
        return n;
    }

    public static int updateIthPosition(int n, int position, int value){
        if(value == 1){
            return setIthBit(n, position);
        }
        else{
            return clearIthBit(n, position);
        }
    }

    public static int bitsClear(int n, int bitsToBeCleared){
        for(int i = 0; i < bitsToBeCleared; i++){
            n = clearIthBit(n, i);
        }
        return n;
    }

    public static int clearRangeOfBits(int n, int lower, int upper){
        
        for(int i = lower; i <= upper; i++){
            n = clearIthBit(n, i);
        }
        
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;

        // // get Ith bit:
        // int position = sc.nextInt();
        // System.out.println(getIthPosition(n, position));

        
        // // setIthBit:
        // int position = sc.nextInt();
        // System.out.println(setIthBit(n, position));


        // // Clear Ith Bit:
        // int position = sc.nextInt();
        // System.out.println(clearIthBit(n, position));


        // // updateIthPosition:
        // System.out.print("Enter the position = ");
        // int position = sc.nextInt();
        // System.out.print("Enter the value = ");
        // int value = sc.nextInt();
        // System.out.println(updateIthPosition(n, position, value));


        // // clear last i bits:
        // System.out.println("Enter the number of bits to be cleared = ");
        // int bitsToBeCleared = sc.nextInt();
        // System.out.println(bitsClear(n, bitsToBeCleared));

        // clearRangeOfBits:
        System.out.println("Enter the lower value of range = ");
        int lower = sc.nextInt();
        System.out.println("Enter the upper value of range = ");
        int upper = sc.nextInt();
        System.out.println(clearRangeOfBits(n, lower, upper));
    }
}
