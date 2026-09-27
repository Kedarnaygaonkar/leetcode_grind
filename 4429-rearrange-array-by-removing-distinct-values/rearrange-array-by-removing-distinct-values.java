class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int freq[]=new int[101];

        int k=0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int max_occurance=Integer.MIN_VALUE;
        for(int i=0;i<freq.length;i++){
            max_occurance=Math.max(freq[i],max_occurance);
        }
        while(max_occurance!=0){
            for(int i=0;i<freq.length;i++){
                if(freq[i]>0){
                    ans[k]=i;
                    k++;
                    freq[i]--;
                }
            }
            max_occurance--;
        }
        
        return ans;
    }
}