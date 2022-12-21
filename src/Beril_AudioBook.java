public class Beril_AudioBook {

    public String title, type, author, narrator;
    public int price, length;

    public Beril_AudioBook(String title, String type, String author, String narrator, int price, int length) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.narrator = narrator;
        this.price = price;
        this.length = length;
    }
    public  void listen(){
        System.out.println(title + " is an audio book and you can listen");
    }

    @Override
    public String toString() {
        return "Beril_AudioBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", narrator='" + narrator + '\'' +
                ", price=" + price +
                ", length=" + length +
                '}';
    }
}
