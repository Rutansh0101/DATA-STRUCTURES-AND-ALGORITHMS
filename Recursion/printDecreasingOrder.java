class printDecreasingOrder{
    
    public static void printDec(int n){
        if(n < 0){
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
        return;
    }
    
    public static void main(String[] args) {
        printDec(5);
        return;
    }
}