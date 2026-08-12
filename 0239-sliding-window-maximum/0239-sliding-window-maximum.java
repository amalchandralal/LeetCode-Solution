class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int []result = new int[nums.length-k+1];
        for(int i = 0 ;i < k;i++){
            while(!deque.isEmpty() && nums[i] > nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        result[0] = nums[deque.peekFirst()];
        for(int i = k ;i<nums.length;i++){
            if(deque.peekFirst() <= i-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[i] > nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
            result[i-k+1] = nums[deque.peekFirst()];

        }
        return result;
        
    }
}