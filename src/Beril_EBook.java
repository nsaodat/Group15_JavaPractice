public class Beril_EBook {
    public String title, type, author, size;
    public int price, pages;

    public void setInfo (String title, String type, String author, String size, int price, int pages) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.size = size;
        this.price = price;
        this.pages = pages;
    }

    public void read (){
        System.out.println(title + " is a reading book");
    }

    @Override
    public String toString() {
        return "EBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", pages=" + pages +
                '}';
    }
}