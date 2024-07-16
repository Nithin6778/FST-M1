import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("mahesh");
        hs.add("Vinod");
        hs.add("ram");
        hs.add("spy");
        hs.add("sai");
        hs.add("srikar");
        System.out.println("Size of hashset: "+hs.size());
        System.out.println("removing an element : "+hs.remove("srikar"));
        if(hs.remove("rocky")){
            System.out.println("Rocky is removed");
        }
        else{
            System.out.println("Rocky is not present in hashset");
        }
        System.out.println("checking whether rocky in set : "+hs.contains("rocky"));
        System.out.println("updated set :" +hs);
    }

}
