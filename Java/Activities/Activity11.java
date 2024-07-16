import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "white");
        colors.put(2, "black");
        colors.put(3, "pink");
        colors.put(4, "voilet");
        colors.put(5, "yellow");
        System.out.println("colors in map: "+colors);
        colors.remove(3);
        if(colors.containsValue("green")){
        System.out.println("Green color is present in map");
        }
        else{
            System.out.println("Green color is not present in map");
        }
        System.out.println("size of map : "+colors.size());
    }

}
