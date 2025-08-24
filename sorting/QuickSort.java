import java.util.Scanner;

public class QuickSort {

    public static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int cnt = 0;
        for(int i = st + 1; i <= end; i++){
            if(arr[i] <= pivot){
                cnt++;
            }
        }

        int pivotIdx = st + cnt;
        swap(arr, st, pivotIdx);
        
        int i = st;
        int j = end;
        while(i < pivotIdx && j > pivotIdx){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        
        return pivotIdx;
    }

    public static void quickSort(int[] arr, int st, int end){
        if(st >= end)   return;

        int pi = partition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);

    }

    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);

        System.out.println("Array after Sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        return;
    }
}
