class Solution {
    public int largestRectangleArea(int[] heights) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int length = heights.length;
        int maxArea = 0;
        for(int i = 0 ; i <= length; i++){
            int height = (i==length)?0:heights[i];
            while(!stack.isEmpty() && height < heights[stack.peek()] ){
                int currentHeight = heights[stack.pop()];
                int width = (stack.isEmpty())? i : i-stack.peek()-1;
                maxArea = Math.max(maxArea, currentHeight*width);
            }
            stack.push(i);
        }
        return maxArea;
        
    }
}