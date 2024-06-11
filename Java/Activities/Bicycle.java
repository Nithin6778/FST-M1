package Activities;

public class Bicycle implements BicycleParts,BicycleOperation {
    int gears;
    int currentspeed;
    Bicycle(int gears,int currentspeed){
        this.gears=gears;
        this.currentspeed=currentspeed;
    }
    @Override
    public void applyBrake(int decrement) {
        // TODO Auto-generated method stub
        currentspeed-=decrement;
    }
    @Override
    public void speedUp(int increment) {
        // TODO Auto-generated method stub
        currentspeed+=increment;
        
    }
    public void bicycleDesc(){
        System.out.println("gears "+ gears  + "\n currentspeed " + currentspeed); 
        

    }
}
