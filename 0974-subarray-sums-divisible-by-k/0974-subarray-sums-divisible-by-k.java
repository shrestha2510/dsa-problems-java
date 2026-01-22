class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int count = 0;
        int sum = 0;
        int[] freq = new int[k];

        freq[0] = 1;

        for (int num : nums) {
            sum += num;
            int rem = ((sum % k) + k) % k;

            count += freq[rem];
            freq[rem]++;
        }

        return count;
    }
}
