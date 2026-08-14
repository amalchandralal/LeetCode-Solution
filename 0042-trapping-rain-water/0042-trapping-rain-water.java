class Solution {
    public int trap(int[] height) {
        int right = height.length-1;
        int left = 0;
        int water = 0;
        int leftMax = 0;
        int rightMax = 0;
        while(left < right){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if(leftMax <= rightMax){
                water += leftMax-height[left];
                left++;
            }else if( rightMax < leftMax){
                water += rightMax-height[right];
                right--;
            }
        }
        return water;        
    }
}