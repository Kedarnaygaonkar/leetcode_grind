class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Brute
        // HashSet<List<Integer>> set=new HashSet<>();
        // for(int i=0;i<nums.length-2;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
        //                 Collections.sort(temp);
        //                 set.add(temp);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> lt=new ArrayList<>();
        // lt.addAll(set);
        // return lt;
        HashSet<List<Integer>> set1=new HashSet<>();
        List<List<Integer>> lt=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            HashSet<Integer> set2=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
               int k=-(nums[i]+nums[j]);
               if(set2.contains(k)){
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],k);
                    Collections.sort(temp);
                    set1.add(temp);
               }
               set2.add(nums[j]);
            }
        }
        lt.addAll(set1);
        return lt;
    }
}