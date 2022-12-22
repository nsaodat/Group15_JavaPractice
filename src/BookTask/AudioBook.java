package BookTask;

public class AudioBook  extends Book{
    public AudioBook(String title, String author, int price) {
        super(title, "AudioBook", author, price);
    }

    public void listen(){
        System.out.println(title + " is a listening book");
    }
}
