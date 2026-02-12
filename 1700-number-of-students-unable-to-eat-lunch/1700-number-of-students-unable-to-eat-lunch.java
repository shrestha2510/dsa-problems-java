class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       Queue<Integer> q = new LinkedList<>();
       for(int s: students){
    
    q.offer(s);
       }
       int rotations = 0;
       int i = 0;
       while(!q.isEmpty() && rotations<q.size()){
        if(q.peek() == sandwiches[i]){
            q.poll();
        i++;
        rotations = 0;
       }
       else{
        q.offer(q.poll());
        rotations++;
       }

       }
       return q.size();
    }
}