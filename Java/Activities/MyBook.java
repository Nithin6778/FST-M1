package Activities;

public class MyBook extends Book {

    @Override
    public void setTitle(String n) {
        // TODO Auto-generated method stub
        this.title= n;
    }
    public static void main(String[] args) {
        MyBook newNovel = new MyBook();
        newNovel.setTitle("Men are from mars");
        System.out.println("Name of the book is "  + newNovel.getTitle());
    }
    
    

}
