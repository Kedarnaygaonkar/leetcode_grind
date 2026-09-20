class Solution {
    public int reverseDegree(String s) {
        int total_sum=0;
        for(int i=0;i<s.length();i++){
            total_sum+=(('a'-s.charAt(i))+26)*(i+1);
        }
        return total_sum;
    }
}