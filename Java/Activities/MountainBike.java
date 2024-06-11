package Activities;

public class MountainBike extends Bicycle {
    int seatheight;

    public MountainBike(int gears,int currentspeed,int seatheight){
        super(gears,currentspeed);
        this.seatheight=seatheight;

    }

    public void setSeatheight(int seatheight) {
        this.seatheight = seatheight;
    }

    public void bicycleDesc(){
        System.out.println("gears " + gears + "\ncurrentspeed " + currentspeed + "\nseatheight " + seatheight);
    }
    public static void main(String[] args) {
        MountainBike mb=new MountainBike(5, 20, 7);
       mb.bicycleDesc();
       mb.speedUp(10);
       mb.applyBrake(4);
       mb.bicycleDesc();
    }
}
