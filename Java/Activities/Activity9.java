package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
     ArrayList <String> chart = new ArrayList<String>();
     chart.add("kishore");
     chart.add("kiran");
     chart.add("lucky");
     chart.add(3,"sulthan");
     chart.add(1,"subbu");
     System.out.println("print all the objects:");
     for(String s:chart){
        System.out.println(s);
     }
        System.out.println("third element in the list is:"+chart.get(3));
        System.out.println("does my list contain:"+chart.contains("Raghav"));
        System.out.println("size of the list is:"+chart.size());
        chart.remove("sulthan");
        System.out.println("size of the list is :"+chart.size());
     }

    

}
