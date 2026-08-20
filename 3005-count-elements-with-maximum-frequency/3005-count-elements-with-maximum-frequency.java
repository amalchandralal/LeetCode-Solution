class Solution {
    public int maxFrequencyElements(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int num: nums){
        //     map.put(num, map.getOrDefault(num,0)+1);
        // }       

        // int maxFreq = 0;
        // for(int freq : map.values()){
        //     maxFreq = Math.max(maxFreq,freq);
        // } 
        // int count = 0;
        // for(int freq : map.values()){
        //     if(freq == maxFreq){
        //         count+=maxFreq;
        //     }
        // }

        // return count;
        int []freq = new int[101];
        for(int num: nums){
            freq[num]++;
        }
        int maxFreq = 0;
        for(int num: freq){
            maxFreq = Math.max(maxFreq,num);

        }
        int count = 0;
        for(int num: freq ){
            if(num == maxFreq){
                count+=maxFreq;
            }
        }
        return count;
    }
}