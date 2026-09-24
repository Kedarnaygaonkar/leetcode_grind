class Solution {
    public int smallestIndex(int[] nums) {
        int index=-1;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int digit_sum=0;
            while(temp!=0){
                digit_sum+=temp%10;
                temp/=10;
            }
            if(digit_sum==i){
                index=i;
                break;
            }
        }
        return index;
    }
}