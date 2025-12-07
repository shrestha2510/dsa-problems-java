class Solution {
    public int findKthPositive(int[] arr, int k) {
        int expected = 1;  // the number we are "looking for" next

        for (int num : arr) {
            if (num > expected) {
                int gap = num - expected;  // how many numbers are missing before 'num'

                if (k <= gap) {
                    // answer is inside this gap
                    return expected + k - 1;
                }

                // skip this whole gap
                k -= gap;
            }

            // move expected to just after this number
            expected = num + 1;
        }

        // if not found inside array range, it's after the last element
        return expected + k - 1;
    }
}
