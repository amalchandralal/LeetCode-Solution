class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int num : piles){
            high = Math.max(high,num);
        }
        int ans = high;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(isPossible(piles,h,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
        
    }
    public static boolean isPossible(int[]arr, int hour, int speed){
        long h = 0;
        for(int val: arr){
            h += (val+speed-1)/speed;
        }

        return h <= hour;
    }
}