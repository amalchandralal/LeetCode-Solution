class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[]ans = new int[n];
        Stack<Integer> helperStack = new Stack<>();

        for(int idx = n-1 ; idx >= 0 ; idx--){
            
            while(!helperStack.isEmpty() && temperatures[idx] >= temperatures[helperStack.peek()]){
                helperStack.pop();
            }

            if(!helperStack.isEmpty() && temperatures[idx] < temperatures[helperStack.peek()]){
                ans[idx] = helperStack.peek()-idx;
                helperStack.push(idx);
                
            }
            if(helperStack.isEmpty()){
                helperStack.push(idx);
            }
        }
        return ans;
        
    }
}