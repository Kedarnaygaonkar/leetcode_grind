class Solution {
    public int climbStairs(int n, int[] costs) {

        int[] min_cost_arr = new int[n + 1];
        Arrays.fill(min_cost_arr, Integer.MAX_VALUE);

        min_cost_arr[0] = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j <= Math.min(i + 3, n); j++) {

                int current_cost = min_cost_arr[i]
                        + costs[j - 1]
                        + (j - i) * (j - i);

                if (current_cost < min_cost_arr[j]) {

                    min_cost_arr[j] = current_cost;
                }
            }
        }
        return min_cost_arr[n];
    }
}