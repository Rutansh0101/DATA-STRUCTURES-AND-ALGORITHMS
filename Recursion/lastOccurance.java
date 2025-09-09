public class lastOccurance {
    public static int findLastOcc(int[] arr, int index, int n){
        if(index < 0){
            return -1;
        }
        if(arr[index] == n){
            return index;
        }
        return findLastOcc(arr, index-1, n);
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,3,4};
        System.out.println(findLastOcc(arr, arr.length-1, 1));
    }
}
