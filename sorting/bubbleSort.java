import java.util.Scanner;

public class bubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            int a = 0;
            int b = a+1;
            for(int j = 0; j < n-1; j++){
                if(arr[a] > arr[b] && (b < n && a < n)){
                    int temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp;
                }
                a++;
                b++;
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}