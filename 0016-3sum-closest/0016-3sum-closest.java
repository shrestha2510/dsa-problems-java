import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n= nums.length;
        int diff = Integer.MAX_VALUE;
        int res =0;
        for(int i=0; i<n-2; i++){
            int l= i+1;
            int r= n-1;
           
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    if(target - sum < diff){
                        res = sum;
                        diff = target-sum;
                    }
                    l++;
                }
                else{
                    if(sum - target < diff){
                        res = sum;
                        diff = sum-target;
                    }
                    r--;
                }
            }
        }
        return res;
    }
}
