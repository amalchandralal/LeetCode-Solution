class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        for(int num: nums){
            left = Math.max(num,left);
            right += num;

        }
        while(left < right){
            int mid = left + (right-left)/2;
            if(canSplit(nums,k,mid)){
                right = mid;
            }else{
                left = mid+1;
            }

        }
        return left;
        
    }
    public boolean canSplit(int arr[],int k,int maxSum){
        int sum = 0;
        int part = 1;
        for(int num: arr){
            if(num+sum > maxSum){
                part++;
                if(part > k){
                    return false;
                }
                sum=num;
            }else{
                sum+=num;
            }
        }
        return part<=k;
    }
}