class Solution {
    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;

        for(int idx = 0 ; idx <= length ; idx++){
            int currentHeight = (idx == length)? 0 : heights[idx];
            
            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = (stack.isEmpty())? idx : idx-stack.peek()-1;
                maxArea = Math.max(maxArea, height*width);

            }
            stack.push(idx);

        }
        return maxArea;
        
    }
}