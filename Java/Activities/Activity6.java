package Activities;

public class Activity6 {

    /**
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException{
        Plane pl=new Plane(10);
        pl.onboard("sri");
        pl.onboard("daksh");
        pl.onboard("kanth");
        pl.onboard("lakshmi");
        System.out.println("takeoff " + pl.takeOff());
        System.out.println("passengers on lane " + pl.getPassesngers());
        Thread.sleep(5000);
        pl.land();
        System.out.println("lasttime landed " + pl.getLastTimeLanded());
        System.out.println("afte landing " + pl.getPassesngers());
        //System.out.println()

    }
}