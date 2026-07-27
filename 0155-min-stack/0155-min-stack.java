class MinStack {
    Stack<Integer> auxStack,minStack;

    public MinStack() {
        auxStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        auxStack.push(value);
        if(minStack.isEmpty()){
            minStack.push(value);
        }else{
            minStack.push(Math.min(value,minStack.peek()));
        }
        
    }
    
    public void pop() {
        auxStack.pop();
        minStack.pop();
        
    }
    public int top() {
        return auxStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */