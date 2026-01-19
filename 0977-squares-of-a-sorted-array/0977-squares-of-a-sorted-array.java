class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int n = nums.length;
        int j=n-1;
        int res[] = new int[n];
        int k = n-1;
     while(i<=j){
        if(Math.abs(nums[i])>Math.abs(nums[j])){
          res[k--] = nums[i]*nums[i];
          i++;
        }
        else{
            res[k--] = nums[j]*nums[j];
            j--;
        }
     }
     return res;
}
}