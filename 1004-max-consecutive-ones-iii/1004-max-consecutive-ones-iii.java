class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxCount = 0,left =0 , zeroCount=0;
        for(int right = 0 ;right < nums.length;right++){
            if(nums[right] == 0){
                zeroCount++;
            }
            if(zeroCount > k){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
        }
        return nums.length-left;
        
    }
}