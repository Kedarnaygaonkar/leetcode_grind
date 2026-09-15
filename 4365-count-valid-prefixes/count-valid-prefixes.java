class Solution {
    public int countValidPrefixes(String s) {
        int valid_prefix=0;
        int onescount=0;
        int zeroscount=0;
        String prefix="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                onescount++;
            }
            else{
                zeroscount++;
            }
            if(((onescount-zeroscount==1)||(onescount-zeroscount==0)||(onescount-zeroscount==-1))){
                valid_prefix++;
            }
            prefix+=s.charAt(i);
        }
        return valid_prefix;
    }
}