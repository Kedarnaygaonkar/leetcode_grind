class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min_sum=Integer.MAX_VALUE;
        int flag=0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.size();j++){
                int sub_sum=0;
                for(int k=i;k<=j;k++){
                    sub_sum+=nums.get(k);
                }
                if(sub_sum>0 && (l<=(j-i+1) && (j-i+1)<=r)){
                    min_sum=Math.min(min_sum,sub_sum);
                    flag=1;
                }
            }
        }
        if(flag==0){
            min_sum=-1;
        }
        return min_sum;
    }
}