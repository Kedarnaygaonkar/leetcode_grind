class Solution {
    public int minMergedInteger(int[] nums) {
        int num_new[]=new int[nums.length/2];
        int k=0;
        for(int i=1;i<nums.length;i++){
            int digit=digitCount(nums[i]);
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
    public int digitCount(int number){
        int temp=number;
        int digit_count=0;
        while(temp!=0){
            digit_count++;
            temp/=10;
        }
        return digit_count;
    }
}