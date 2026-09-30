class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0;
        int counter=0;
        int arr[]=new int[2];
        for(int i=0;i<events.length;i++){
            if(counter==10){
                break;
            }
            for(int j=0;j<events[i].length();j++){
                if(events[i].length()==2){
                    if(events[i].charAt(j)=='W'){
                        score++;
                    }
                    if(events[i].charAt(j)=='N'){
                        score++;
                    }
                }
                if(events[i].length()==1){
                    if(events[i].charAt(j)=='W'){
                        counter++;
                    }
                }
                if(events[i].charAt(j)=='1'){
                    score+=1;
                }
                if(events[i].charAt(j)=='2'){
                    score+=2;
                }
                if(events[i].charAt(j)=='3'){
                    score+=3;
                }
                if(events[i].charAt(j)=='4'){
                    score+=4;
                }
                if(events[i].charAt(j)=='5'){
                    score+=5;
                }
                if(events[i].charAt(j)=='6'){
                    score+=6;
                }
            }
        }
        arr[0]=score;
        arr[1]=counter;

        return arr;
    }
}