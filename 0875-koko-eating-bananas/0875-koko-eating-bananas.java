class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int val: piles){
            high = Math.max(val,high);
        }
        int ans = high;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(isPossible(piles,mid,h)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }

        }
        return ans;
        
    }
    public static boolean isPossible(int []arr,int speed,int hour){
        long h  = 0;
        for(int val : arr){
            h += (val+speed-1)/speed;
        }
        
        return h <= hour;
    }
}