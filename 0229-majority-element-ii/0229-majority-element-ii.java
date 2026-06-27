class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List list = new ArrayList<>();
        for(int i=0 ;i<nums.length;i++){
            int count = 0;
            if(!list.contains(nums[i])){
                for(int j=0;j<nums.length;j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
            }if(count > (nums.length/3)){
                list.add(nums[i]);
            }
        }return list;
        
    }
}