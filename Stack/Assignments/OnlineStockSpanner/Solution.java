class StockSpanner {

    Stack<Integer[]> stack;
    
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int ans = 1;
    
        while(!stack.isEmpty() && price >= stack.peek()[0]){
            ans += stack.pop()[1];
        }
        stack.push(new Integer[]{price, ans});
        
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
