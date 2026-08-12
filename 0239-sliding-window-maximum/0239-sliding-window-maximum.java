class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> queue = new ArrayDeque<>();
        int []result = new int[n-k+1];
        for(int i = 0 ; i < k ; i++){
            while(!queue.isEmpty() && nums[i] > nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
        }
        result[0] = nums[queue.peekFirst()];

        for(int i = k ; i < n ; i++){
            if(i-k == queue.peekFirst()){
                queue.pollFirst();
            }
            while(!queue.isEmpty() && nums[i] > nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
            result[i-k+1] = nums[queue.peekFirst()];
        }
        return result;
        
    }
}