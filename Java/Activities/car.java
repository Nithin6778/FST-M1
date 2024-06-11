package Activities;

public class car {
    String colour;
    String  transmission;
    int make;
    int tyres;
    int doors;
    
        car(){
        tyres=4;
        doors=4;
    }
   public void displayCharacteristics(){
   System.out.println("colour of the car is " + colour);
   System.out.println("Transmission is " +  transmission);
   System.out.println("car made on " +  make);
   System.out.println("no of tyres "  +  tyres);
   System.out.println("no of doors "  +  doors);
   }

    public void accelarate(){
    System.out.println("car is moving forward.");
    }

    public void brake(){
    System.out.println("car stopped.");
    }
}
