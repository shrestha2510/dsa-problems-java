class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int gift : gifts){
            pq.offer(gift);
        }
        long sum = 0;
        while(k!=0){
            int max = pq.poll();
            int remaining = (int)Math.sqrt(max);
            k--;
            pq.offer(remaining);
        }
        while(pq.size()!=0){
            sum += pq.poll();
        }
        return sum;
    }
}