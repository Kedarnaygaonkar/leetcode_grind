class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lt=new ArrayList<>();
        parenthesis(lt,n,0,0,"");
        return lt;
    }
    public void parenthesis(List<String> lt,int n,int open,int close,String s){
        if(s.length() == 2*n){
            lt.add(s);
            return;
        }
        if(open<n){
            parenthesis(lt,n,open+1,close,s+'(');
        }
        if(close<open){
            parenthesis(lt,n,open,close+1,s+')');
        }
    }
}