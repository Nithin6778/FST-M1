package Activities;

public class Activity7 {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 0, 25);
    System.out.println(mb.bicycleDesc());
    mb.speedUp(20);
    mb.applyBrake(5);

        }
    }

interface BicycleParts{
    public  int gears = 0;
    public  int speed = 0;
}
interface BicycleOperations{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
class Bicycle implements BicycleParts,BicycleOperations{
    int gears;
    int speed;
 public Bicycle (int gears,int speed){
    this.gears=gears;
    this.speed=speed;
 }
 public void applyBrake(int decrement){
    speed-=decrement;
    System.out.println("speed decreased:"+speed);
 }
 public void speedUp(int increment){
    speed+=increment;
    System.out.println("speed increased"+speed);
 
}
public String bicycleDesc() {
    return("No of gears are "+ gears + "\nSpeed of bicycle is " + speed);
}
}
class MountainBike extends Bicycle{
    public int seatHeight; 
public MountainBike(int gears,int speed,int height){
    super(gears, speed);
    seatHeight=height;
}
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    public String bicycleDesc(){
        return(super.bicycleDesc()+"seatHeight"+seatHeight);
    }
}