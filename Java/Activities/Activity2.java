package Activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] kicks = {10, 77, 10, 54, -11, 10};
        int sum = 0;
        for(int i:kicks){
            if (i==10) {
            sum+=i;

            }
        }
        if (sum==30) {
            System.out.println("THE SUM OF 10'S = 30");   
        }
        else{
            System.out.println("THE SUM OF 10'S != 30");   
        }
        
    }

}
