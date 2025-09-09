public class convertIntToString {

    public static void printString(String newStr, String[] nums, int n, int count){
        if(count < 0){
            System.out.println(newStr);
            return;
        }
        int index = n / (int)Math.pow(10, count);
        if(count != 0)
        newStr += nums[index%10] + " ";
        else
        newStr += nums[index%10];
        printString(newStr, nums, n, count-1);
    }

    public static void main(String[] args) {
        String[] nums = new String[10];
        nums[0] = "zero";
        nums[1] = "one";
        nums[2] = "two";
        nums[3] = "three";
        nums[4] = "four";
        nums[5] = "five";
        nums[6] = "six";
        nums[7] = "seven";
        nums[8] = "eight";
        nums[9] = "nine";

        int number = 1234;
        printString("", nums, number, 3);
    }
}
