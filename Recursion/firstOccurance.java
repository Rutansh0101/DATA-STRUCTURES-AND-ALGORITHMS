public class firstOccurance {
    
    public static int findFirstOcc(int[] arr, int index, int n){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == n){
            return index;
        }
        return findFirstOcc(arr, index+1, n);
    }
    
    public static void main(String[] args) {
        int arr[] = {-4,(int)16/4,4,+4,44};
        System.out.println(findFirstOcc(arr, 0, +4));
    }
}
