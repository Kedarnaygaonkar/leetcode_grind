class Solution {
    public String removeOuterParentheses(String s) {
        String k="";
        int open=0;
        int close=0;
        int j1=0;
        int j2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }else{
                close++;
            }
            if(open==close){
                j2=i+1;
                String l=s.substring(j1,j2);
                int new_open=0;
                int new_close=0;
                int k1=1;
                int k2=0;
                for(int j=1;j<l.length()-1;j++){
                    if(l.charAt(j)=='('){
                        new_open++;
                    }
                    else{
                        new_close++;
                    }
                    if(new_open==new_close){
                        k2=j+1;
                        k+=l.substring(k1,k2);
                        k1=j+1;
                    }

                }
                j1=i+1;
            }
        }
        return k;

    }
}