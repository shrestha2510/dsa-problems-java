class RecentCounter {
Queue<Integer> q;
    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        q.offer(t);
       while(!q.isEmpty() && t-3000> q.peek()){
        q.poll();
       }
       return q.size();
    }
}

