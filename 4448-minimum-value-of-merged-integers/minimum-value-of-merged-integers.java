class Solution {
    public int minMergedInteger(int[] nums) {
        int num_new[]=new int[nums.length/2];
        int k=0;
        for(int i=1;i<nums.length;i++){
            int digit=(int) Math.floor(Math.log10(Math.abs(nums[i]))) + 1;
            num_new[k]=(int)(nums[i]+nums[i-1]*(Math.pow(10,digit)));
            i++;
            k++;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num_new.length;i++){
            min=Math.min(min,num_new[i]);
        }
        return min;
    }
}