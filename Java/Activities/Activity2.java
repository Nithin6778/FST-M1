package Activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] numarray= {10, 77, 10, 54, -11,10};
        int sum=0;
        for(int i=0;i<numarray.length;i++){
            if(numarray[i]==10){
                sum=sum+numarray[i];
                                     
            }
        }
        if(sum==30){
            System.out.println("true");
                         
        }
        else{
            System.out.println("false");
        }



        
    }


}
