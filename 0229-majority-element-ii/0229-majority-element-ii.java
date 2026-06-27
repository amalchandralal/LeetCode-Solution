class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int ans1 = 0;
        int ans2 = 0;
        for(int num: nums){
            if(ans1 == num){
                count1++;
            }else if(ans2 == num){
                count2++;
            }else if(count1 == 0){
                ans1 = num;
                count1++;
            }else if(count2 == 0){
                ans2 = num;
                count2++;
            }else{
                count1--;
                count2--;
            }    
        }
        count1 = 0;
        count2 = 0;
        for(int num: nums){
            if(num == ans1){
                count1++;
            }else if(num == ans2){
                count2++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int limit = (nums.length/3);
        if(count1 > limit ) ans.add(ans1);
        if(count2 > limit) ans.add(ans2);
        return ans;
    }
}