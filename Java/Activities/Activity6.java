package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
plane.onboard("nithin");
plane.onboard("mahesh");
plane.onboard("kiran");
  System.out.println("takeoff:"+plane.takeOff()); 
  System.out.println("Passengers:"+plane.getPassengers()); 
  Thread.sleep(5000);
  plane.land();
  System.out.println("takeoff:"+plane.lastTimeLanded());
    }

}
class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    public Plane(int maxPassengers)
    {
      this.passengers=new ArrayList<>();
    }
public void onboard(String passengers){
this.passengers.add(passengers);
}
public Date takeOff(){
    return new Date();
}
public void land(){
    lastTimeLanded = new Date();
    passengers.clear();
}
public Date lastTimeLanded(){
    return lastTimeLanded;
}
public List<String> getPassengers(){
    return passengers;
}
    }

