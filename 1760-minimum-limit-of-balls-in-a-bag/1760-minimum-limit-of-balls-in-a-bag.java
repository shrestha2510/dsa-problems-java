class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = Integer.MIN_VALUE;
        for(int num : nums){
            if(right<num){
                right = num;
            }
        }
        while(left<right){
            int mid = left + (right-left) /2;
            if(canreduce(nums, mid, maxOperations)){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
    private boolean canreduce(int nums[], int max, int maxop){
        int ops = 0;
        for(int balls : nums){
            ops+= (balls-1)/max;
            if(ops>maxop){
                return false;
            }
        }
        return true;
    }
}