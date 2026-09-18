class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int x2=target[0];
        int y2=target[1];

        int best_index=Integer.MAX_VALUE;
        int min_distance=Integer.MAX_VALUE;
        int flag=0;
        for(int i=0;i<drones.length;i++){
            int x1=drones[i][0];
            int y1=drones[i][1];
            int range=drones[i][2];

            int manhattan_distance=Math.abs(x2-x1)+Math.abs(y2-y1);

            if(manhattan_distance<=range){
                if(manhattan_distance<=min_distance){
                    if(manhattan_distance==min_distance){
                        best_index=Math.min(best_index,i);
                    }
                    else{
                        best_index=i;
                    }
                    flag++;
                    min_distance=Math.min(min_distance,manhattan_distance);
                }
            }
        }
        if(flag==0){
            return -1;
        }
        return best_index;
    }
}