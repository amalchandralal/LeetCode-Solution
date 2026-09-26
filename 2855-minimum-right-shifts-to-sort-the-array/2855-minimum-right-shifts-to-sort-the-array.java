class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int index = -1;
        int breaks = 0;
        for(int i = 0 ;i < n;i++){
            int next = (i+1)%n;
            if(nums.get(i) > nums.get(next)){
                breaks++;
                index = i;
            }
        }
        if(breaks > 1){
            return -1;
        }
        if(breaks == 0){
            return 0;
        }
        return n-index-1;

    }
}