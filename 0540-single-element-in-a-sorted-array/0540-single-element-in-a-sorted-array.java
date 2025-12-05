class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            // Ensure mid is even
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2; // pair is correct, single is to the right
            } else {
                right = mid; // pair is broken, single is at mid or left
            }
        }
        return nums[left];
    }
}
