class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int idx = 0;
       int n = nums.length;
       Deque<Integer> deque = new ArrayDeque<>();
       int a[] = new int[n-k+1];
       for(int i=0;i<n;i++){
        
        if(!deque.isEmpty() && deque.peekFirst() == i-k){
            deque.pollFirst();
        }
        while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
            deque.pollLast();
        }
        deque.offerLast(i);

        if(i>= k-1){
            a[idx++] = nums[deque.peekFirst()];
        }
       }
       return a;
    }
}