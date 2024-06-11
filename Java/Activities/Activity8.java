package Activities;

public class Activity8 {
    static void exceptionTest(String message)throws CustomException{
        if(message!=null){
           System.out.println(message);          
            
        }
        else{
            throw new CustomException(message);
        }
     
    }
    public static void main(String[] args) {

     try{
        Activity8.exceptionTest("will not console");
        Activity8.exceptionTest(null);
        
        
     }  
     catch(CustomException mes){
        System.out.println(mes.getMessage());
     } 
    }

}
