class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int freq[]=new int[201];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]+100]++;
        }
        int j=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=1){
                nums[j]=i-100;
                k++;
                j++;
            }
        }
        return k;
    }
}