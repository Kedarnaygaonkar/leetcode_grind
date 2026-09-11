import java.util.ArrayList;

class Solution {
    public int countGoodRotations(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }

        int n = arr.size();

        // Total sum
        long total = 0;

        for (int i = 0; i < n; i++) {
            total += arr.get(i);
        }

        // Initial first half
        long firsthalf = 0;

        for (int i = 0; i < n / 2; i++) {
            firsthalf += arr.get(i);
        }

        // Initial second half
        long secondhalf = total - firsthalf;

        int good = 0;

        // We DON'T rotate the ArrayList
        for (int i = 0; i < n; i++) {

            // Check current rotation
            if (firsthalf > secondhalf) {
                good++;
            }

            // Element leaving first half
            int leaving = arr.get(i);

            // Element entering first half
            int entering = arr.get((i + n / 2) % n);

            // Update the sums
            firsthalf = firsthalf - leaving + entering;
            secondhalf = total - firsthalf;
        }

        return good;
    }
}