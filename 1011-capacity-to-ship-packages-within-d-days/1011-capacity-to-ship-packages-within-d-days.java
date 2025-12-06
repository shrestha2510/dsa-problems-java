class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int left = 0, right = 0;

        for (int w : weights) {
            left = Math.max(left, w); // at least heaviest weight
            right += w;               // at most sum of all
        }

        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                ans = mid;        // possible answer, try smaller
                right = mid - 1;
            } else {
                left = mid + 1;    // capacity too small
            }
        }
        return ans;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int currentLoad = 0, requiredDays = 1;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                requiredDays++;    // ship next day
                currentLoad = w;
            } else {
                currentLoad += w;
            }

            if (requiredDays > days) return false; // too many days
        }
        return true;
    }
}
