class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int left = 1;
        int right = 0;

        // right = maximum number in nums
        for (int x : nums) {
            if (x > right) {
                right = x;
            }
        }

        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2; // current divisor

            if (canDivide(nums, threshold, mid)) {
                answer = mid;        // mid works, try smaller
                right = mid - 1;
            } else {
                left = mid + 1;      // mid too small, need bigger
            }
        }

        return answer;
    }

    private boolean canDivide(int[] nums, int threshold, int d) {
        long sum = 0; // use long to be safe

        for (int x : nums) {
            // ceil(x / d) = (x + d - 1) / d
            sum += (x + d - 1) / d;

            if (sum > threshold) {
                return false; // already too big, no need to continue
            }
        }

        return sum <= threshold;
    }
}
