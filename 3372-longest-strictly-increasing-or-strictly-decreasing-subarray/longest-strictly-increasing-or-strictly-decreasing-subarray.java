class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int length=1;
        int max_length=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                length++;
            }
            else if(nums[i]<nums[i-1]){
                max_length=Math.max(max_length,length);
                length=1;
            }else{
                length=1;
            }
            max_length=Math.max(max_length,length);
        }
        max_length=Math.max(max_length,length);
        length=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                length++;
            }
            else if(nums[i]>nums[i-1]){
                length=1;
            }else{
                length=1;
            }
            max_length=Math.max(max_length,length);
        }
        max_length=Math.max(max_length,length);
        return max_length;
    }
}