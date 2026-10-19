class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> lt=new LinkedList<>();
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                flag=1;
            }
        }
        if(flag==0){
            return lt;
        }
        Arrays.sort(nums);
        int idx=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                idx=mid;
                break;
            }
            else if(target<nums[mid]){
                end=mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
        }
        int i=0;
        while(i<idx){
            if(nums[i]==target){
                break;
            }
            i++;
        }
        int j=nums.length-1;
        while(idx<j){
            if(nums[j]==target){
                break;
            }
            j--;
        }
        while(i<=j){
            lt.add(i);
            i++;
        }
        return lt;
    }
}