class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int []results = new int[n-k+1];
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0 ; i < k ; i++){
            while(!deque.isEmpty() && nums[i] > nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        results[0] = nums[deque.peekFirst()];

        for(int i = k; i < n; i++){
            if(i-k == deque.peekFirst()){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[i] > nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);

            results[i-k+1] = nums[deque.peekFirst()];
        }
        return results;
        
    }
}