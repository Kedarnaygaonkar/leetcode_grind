class Solution {
    public int peakValleyDifference(int[] nums) {
        int peak_sum=0;
        int vally_sum=0;

        for(int i=1;i<nums.length-1;i++){
            if(nums[i]<nums[i-1] && nums[i]<nums[i+1]){
                vally_sum+=nums[i];
            }
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                peak_sum+=nums[i];
            }
        }

        return (peak_sum)-(vally_sum);
    }
}