class Solution {
    public int[] leftRightDifference(int[] nums) {
        int result[] = new int[nums.length];
        int total = 0;
        for(int num: nums){
            total += num;
        }
        int left = 0;
        for(int i = 0;i<nums.length;i++){
            int right = total-left-nums[i];
            result[i]= Math.abs(right-left);
            left+=nums[i];
        }
        return result;
        
    }
}