public class Activity5 {
    public static void main(String[] args) {
        MyBook b=new MyBook();
        b.setTittle("Racing");
        System.out.println("New Tittle : "+ b.getTittle());
    }

}
abstract class Book {
    String tittle;
abstract void setTittle(String s);
public String getTittle(){
    return tittle;
}   
}

class MyBook extends Book{
    public void setTittle(String s)
    {   
        tittle=s;
    }
}