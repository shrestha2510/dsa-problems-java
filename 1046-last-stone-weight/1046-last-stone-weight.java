class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : stones){
            pq.offer(num);
        }
        while(pq.size()>1){
            int y = pq.poll();
            int x = pq.poll();
            if(y-x == 0){
                continue;
            }
            else{
                pq.offer(y-x);
            }
           
        }
         if(pq.size()==1){
                return pq.peek();
            }
        return 0;
    }
}