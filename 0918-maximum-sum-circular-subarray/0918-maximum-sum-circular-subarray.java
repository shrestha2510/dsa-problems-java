class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int curmax = 0, maxsum = nums[0];
        int curmin = 0, minsum = nums[0];

        for(int i=0;i<nums.length;i++){
            total += nums[i];

            curmax = Math.max(nums[i],curmax+nums[i]);
            maxsum = Math.max(maxsum,curmax);

            curmin = Math.min(nums[i], curmin+nums[i]);
            minsum = Math.min(minsum,curmin);
        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,total-minsum);
    }
}