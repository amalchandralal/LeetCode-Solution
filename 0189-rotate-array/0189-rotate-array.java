class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        helperFunction(nums,0,n-1);
        helperFunction(nums,0,k-1);
        helperFunction(nums,k,n-1);
        
    }
    public void helperFunction(int []arr,int start,int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}