package Activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
       
        HashMap<Integer,String> colours = new HashMap<Integer,String> ();
        colours.put(1,"Red");
        colours.put(2,"green");
        colours.put(3,"pink");
        colours.put(4,"brown");
        colours.put(5,"yellow");       

        System.out.println("Printing the map :" + colours);
        colours.remove(3);
        System.out.println("After Removing one colour hash map has: " +colours);
        System.out.println("map has green colour?" + colours.containsValue("green"));
        System.out.println("Printing size of the map :" + colours.size());
    }

}
