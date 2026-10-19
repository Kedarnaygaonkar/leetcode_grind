class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> lt=new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                lt.add(i);
            }
        }
        return lt;
    }
}