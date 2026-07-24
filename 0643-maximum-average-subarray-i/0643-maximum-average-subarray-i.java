class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double answer = sum;
        for(int i = k ;i< nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            answer = Math.max(sum,answer);
        }
        return answer/k;
        
    }
}