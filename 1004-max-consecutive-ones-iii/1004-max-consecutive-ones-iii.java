class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add the new element
            if (nums[right] == 0) {
                zeroCount++;
            }

            if(zeroCount > k){
                if(nums[left]== 0){
                    zeroCount--;
                }
                left++;
            }

           

        }

        return nums.length-left;
    }
}