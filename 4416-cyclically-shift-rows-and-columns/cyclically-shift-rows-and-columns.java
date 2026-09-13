class Solution {
    public int[][] cyclicShift(int n, int[][] grid,
                               int[] rowShift, int[] colShift) {

        int[][] grid2 = new int[n][n];

        // Shift rows LEFT
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int k=rowShift[i];
                grid2[i][(j - k + n) % n] = grid[i][j];
            }
        }

        int[][] grid3 = new int[n][n];

        // Shift columns UP
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                int k = colShift[j];
                grid3[(i - k + n) % n][j] = grid2[i][j];
            }
        }

        return grid3;
    }
}