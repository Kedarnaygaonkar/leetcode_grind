class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num){
            return "";
        }
        StringBuilder good_integer=new StringBuilder("");
        while(num!=0 || sum!=0){
            if(sum>9){
                good_integer.append('9');
                num=num-1;
                sum=sum-9;
            }else{
                good_integer.append((char)('0'+sum));
                num=num-1;
                sum=0;
            }
        }
        // good_integer=goodInteger(good_integer,num,sum);
        return good_integer.toString();
    }
    // public String goodInteger(String good_integer,int num,int sum){
    //     if(sum<=0 && num<=0){
    //         return good_integer;
    //     }
    //     if(sum>9){
    //         good_integer=goodInteger(good_integer+'9',num-1,sum-9);
    //     }else{
    //         good_integer=goodInteger(good_integer+(char)('0'+sum),num-1,0);
    //     }
    //     return good_integer;
    // }
}