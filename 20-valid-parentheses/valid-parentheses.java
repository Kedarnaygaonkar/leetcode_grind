class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int open_count=0;
        int close_count=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)==')') || (s.charAt(i)==']') || (s.charAt(i)=='}')){
                close_count++;
            }
            else{
                open_count++;
            }
        }
        if(open_count!=close_count){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            if(!st.isEmpty()){
                if(s.charAt(i)==')' && st.peek()=='(' ){
                    st.pop();
                }
                if(s.charAt(i)==']' && st.peek()=='[' ){
                    st.pop();
                }
                if(s.charAt(i)=='}' && st.peek()=='{'){
                    st.pop();
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}