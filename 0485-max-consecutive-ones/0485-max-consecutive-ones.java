class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0, maxCount = 0 , j = 0;
        while(j < nums.length){
            if(nums[j] == 1){
                currentCount++;
            }else{
                maxCount = Math.max(currentCount, maxCount);
                currentCount = 0;  
            }
            
            if(j == nums.length-1){
                maxCount = Math.max(currentCount, maxCount);
            }
            j++;
        }
        return maxCount;
    }
}