package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
         HashSet<String> hs=new HashSet<String>();
         hs.add("sri");
         hs.add("lakshmi");
         hs.add("poka");
         hs.add("daksh");
         hs.add("kanth");
         hs.add("fam");
        
        System.out.println("size of hashset is: " +hs.size());
        hs.remove("fam");
        System.out.println(hs);
        hs.remove("fam");
        System.out.println("is fam there in set? " + hs.contains("fam"));
        System.out.println("print updated set : " + hs);

    }

}
