class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int limit = nums.length/3;
        for(int num : nums){
            int freq = (map.getOrDefault(num,0)+1);
            map.put(num,freq);
            if(freq == limit+1){
                list.add(num);
            }
        }return list;
        
    }
}