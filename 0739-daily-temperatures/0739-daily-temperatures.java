class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> helperStack = new Stack<>();
        int len = temperatures.length;
        int []res = new int[len];

        //iterating the stack from right to left
        for(int idx = len-1 ; idx >= 0 ; idx--){
            //if the stack is not empty and current element is less than the stack top then pop the stack elements until we get a greater element;
            while(!helperStack.isEmpty() && temperatures[helperStack.peek()] <= temperatures[idx]){
                helperStack.pop();
            }
            // if the stack top is greater than the element , find the differnece in the index and push to result array
            if(!helperStack.isEmpty() ){
                res[idx] = helperStack.peek() - idx;
            }

            helperStack.push(idx);
        }
        //returning res
        return res;
        
    }
}