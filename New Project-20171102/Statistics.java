class Statistics{
    static void average(double [] arg){
        double avg=0.0;
        double sum=0.0;
        
        if(arg.length>0){
                for(double s:arg){
                    sum=sum+s;
                }
                
                avg=sum/arg.length;
                System.out.println("Average Values is "+avg);
        }else{
            System.out.println("Average Values is not available.");
        }
    }
    
}