class MyQueue {

    Stack<Integer> norm;
    Stack<Integer> rev;
    int length = 0;
    
    // stack LIFO 1-2-3-4-out
    // Q FIFO out-2-3-4
    public MyQueue() {
        this.length =0;
        this.norm = new Stack<>();
        this.rev = new Stack<>();
    }
    
    public void push(int x) {
        this.norm.push(x); // 1-2-out
        this.length++;
    }
    
    public int pop() {
        while(!norm.isEmpty()){
            rev.push(norm.pop()); // 4-3-2-1-out
        }
        int popped = rev.pop();
        
        while(!rev.isEmpty()){
            norm.push(rev.pop()); // out-1-2-3-4
        }
        this.length--;
        return popped;
    }
    
    public int peek() {
        while(!norm.isEmpty()){
            rev.push(norm.pop()); // 4-3-2-1-out
        }
        int peeked = rev.peek();
        
        while(!rev.isEmpty()){
            norm.push(rev.pop()); // out-1-2-3-4
        }
        return peeked;
    }
    
    public boolean empty() {
        return this.length == 0;
    }
    // space: O(n) + O(n) --> O(n)
}   // time: O(n) pop and peek, O(1) push and isEmpty()

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */