package Activities;

public class Activity5 {
    public static void main(String[] args) {
        MyBook jj = new MyBook();
        jj.setTitle("workspace");
        System.out.println("The title is: " + jj.getTitle());
        
    }

}
abstract class Book{
    String title;
    abstract void setTitle(String smk);
    public String getTitle()
    {
        return title;
    }
}
class MyBook extends Book{
    public void setTitle(String smk) {
        title = smk;
    }

}