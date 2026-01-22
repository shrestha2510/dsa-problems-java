class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        if(sum/k >= threshold){
            count++;
        }
        int win = sum;
        for(int i = k; i < arr.length; i++){
            win += arr[i] - arr[i-k];
            if(win/k >= threshold){
                count++;
            }
        }
        return count;
    }
}