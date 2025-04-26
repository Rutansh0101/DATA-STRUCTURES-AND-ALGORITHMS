import java.util.Scanner;

public class allOcc{
    
    public static void findAllOcc(int[] arr, int num, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == num){
            System.out.print(index + " ");
        }
        findAllOcc(arr, num, index+1);
        return;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int number = sc.nextInt();
        findAllOcc(arr, number, 0);

        sc.close();
    }
}