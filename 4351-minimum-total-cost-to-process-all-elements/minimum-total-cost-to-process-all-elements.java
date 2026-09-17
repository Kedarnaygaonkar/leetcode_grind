class Solution {
    public int minimumCost(int[] nums, int k) {

        final long MOD = 1000000007L;

        long cost = 0;
        long resources = k;
        long operation = 1;
        long originalK = k;

        for (int x : nums) {

            if (resources < x) {

                long needed = (long)x - resources;

                long cnt = (needed + originalK - 1) / originalK;

                // cnt consecutive integers starting from operation
                long sum;

                if (cnt % 2 == 0) {
                    sum = (cnt / 2) % MOD;
                    sum = (sum * ((2 * operation + cnt - 1) % MOD)) % MOD;
                } else {
                    sum = cnt % MOD;
                    sum = (sum * ((2 * operation + cnt - 1) / 2 % MOD)) % MOD;
                }

                cost = (cost + sum) % MOD;

                operation += cnt;

                // Only the actual remaining resources are needed.
                resources = resources + cnt * originalK - x;
            } 
            else {
                resources -= x;
            }
        }

        return (int) cost;
    }
}