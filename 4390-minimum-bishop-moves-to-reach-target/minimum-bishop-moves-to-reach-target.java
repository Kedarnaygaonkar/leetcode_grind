class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int moves=0;
        //if on a different tile
        if((source[0]+source[1])%2 != (target[0]+target[1])%2)
        {
            return -1;
        }

        if((source[0]+source[1])==(target[0]+target[1]) || (source[0]-source[1])==(target[0]-target[1])){
            moves=1;
        }
        else{
            moves=2;
        }
        return moves;
        
    }
}