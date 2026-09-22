class Solution {
    public int countSpecialIntegers(int[] nums) {
        int freq[]=new int[101];
        int special=0;

        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]==3){
                int i1=0;
                int i2=0;
                int i3=0;
                int num_count=0;
                for(int j=0;j<nums.length;j++){
                    if(i==nums[j]){
                        num_count++;
                        if(num_count==1){
                            i1=j;
                        }
                        if(num_count==2){
                            i2=j;
                        }
                        if(num_count==3){
                            i3=j;
                        }
                    }
                }
                if(i3-i2==i2-i1){
                    special++;
                }
            }
        }
        
        return special;
    }
}
