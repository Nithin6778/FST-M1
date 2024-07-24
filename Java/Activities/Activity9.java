package Activities;

import java.util.ArrayList;

public class Activity9 {
       public static void main(String[] args) {
        ArrayList<String> myList=new ArrayList<String>();
        myList.add("sri");
        myList.add("Daksh");
        myList.add("kanth");
        myList.add("lakshmi");
        myList.add("family");

        for(int i=0;i<myList.size();i++){

            System.out.println(myList.get(i));

        }
        System.out.println(myList.get(2));
        System.out.println("if name sri exists?: " + myList.contains("sri"));

        System.out.println("size of arrayList is: "+ myList.size());
        
        myList.remove(3);
        System.out.println("current size of arrayList is: "+ myList.size());
        

    }


}
