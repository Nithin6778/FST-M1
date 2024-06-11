package Activities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import javax.xml.crypto.Data;

class Plane {
   private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

  
   public Plane(int maxPassengers){
        this.maxPassengers=maxPassengers;
        this.passengers= new ArrayList<>();
    }
    public void onboard(String passenger){
        this.passengers.add(passenger);

    }
    public Date takeOff(){
        this.lastTimeTookOf=new Date();
        return lastTimeTookOf;
    }
    public Date land(){
        this.lastTimeLanded=new Date();
        this.passengers.clear();
        return lastTimeLanded;
    }
    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }
    public List<String> getPassesngers(){
        return passengers;
    }


    

}
