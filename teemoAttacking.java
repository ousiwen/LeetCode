public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        if(timeSeries.length == 0){
            return 0;
        }else if(timeSeries.length == 1){
            return duration;
        }
        int start=timeSeries[0];
        int end=timeSeries[0]+duration;
        int result=0;
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i] > end){
                result += end-start;
                start=timeSeries[i];
            }
            end=timeSeries[i]+duration;
        }
        result += end - start;
        return result;
 }
