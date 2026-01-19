class Solution {
    public int maxArea(int[] height) {
      int left=0;
      int right= height.length -1;
      int maxarea=0;
      while(left<right){
        if(height[left]<height[right]){
            int res = height[left]*(right - left);
            maxarea = Math.max(res,maxarea);
            left++;
        }
        else {
            int res = height[right]*(right-left);
            maxarea = Math.max(res,maxarea);
            right--;
        }
      }
      return maxarea;
    }
}
