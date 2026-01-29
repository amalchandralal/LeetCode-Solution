import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for(int i = 0; i < nums.length ; i++){
            int current = Math.abs(nums[i]);
            int index = current - 1;
            if(nums[index] < 0 ){
                duplicates.add(current);
            } else {
                nums[index] = -nums[index];
            }
        }
        return duplicates;
    }
}
