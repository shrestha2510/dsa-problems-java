class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];

        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // store score and index
        for(int i=0;i<n;i++){
            pq.offer(score[i]);
            map.put(score[i], i);
        }

        int rank = 1;

        while(!pq.isEmpty()){
            int curr = pq.poll();
            int idx = map.get(curr);

            if(rank == 1)
                answer[idx] = "Gold Medal";
            else if(rank == 2)
                answer[idx] = "Silver Medal";
            else if(rank == 3)
                answer[idx] = "Bronze Medal";
            else
                answer[idx] = String.valueOf(rank);

            rank++;
        }
        return answer;
    }
}
