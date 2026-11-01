class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            min=Math.min(nums[i],min);
            sum+=nums[i];
        }
        return sum-(n*min);
    }
} 