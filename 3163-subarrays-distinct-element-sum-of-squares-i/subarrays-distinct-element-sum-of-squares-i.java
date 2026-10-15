class Solution {
    public int sumCounts(List<Integer> nums) {
        int sumCounts=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                int freq[]=new int[101];
                for(int k=i;k<=j;k++){
                    freq[nums.get(k)]++;
                }
                int count=0;
                for(int l=1;l<101;l++){
                    if(freq[l]>=1){
                        count++;
                    }
                }
                sumCounts+=count*count;
            }
        }
        return sumCounts+nums.size();
    }
}