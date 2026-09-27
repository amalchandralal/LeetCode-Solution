class Solution {
    public int rob(int[] nums) {
        if(nums.length < 2){
            return nums[0];
        }
        int n = nums.length;
        int []skipFirstHouse = new int[n-1];
        int []skipLastHouse = new int[n-1];
        for(int i = 0 ;i < n-1;i++){
            skipFirstHouse[i] = nums[i+1];
            skipLastHouse[i] = nums[i];
        }
        return Math.max(helpRobber(skipFirstHouse),helpRobber(skipLastHouse));
        
    }
    public static int helpRobber(int []arr){
        int n = arr.length;
        if(n == 1){
            return arr[arr.length-1];
        }
        int[]ans = new int[n];
        ans[0] = arr[0];
        ans[1] = Math.max(arr[0],arr[1]);
        for(int i = 2 ;i < arr.length;i++){
            ans[i] = Math.max(ans[i-2]+arr[i],ans[i-1]);
        }
        return ans[ans.length-1];
    }
}