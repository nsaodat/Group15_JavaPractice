package BookTask;

public class EBook extends Book {
    public EBook(String title, String author, int price) {
        super (title,  "Ebook", author, price);
    }

    public void read(){
        System.out.println(title + " is a reading book");


    }
}
