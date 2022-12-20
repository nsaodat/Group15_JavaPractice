public class Book {


        public String title,type, author;
        public int price;

    public Book(String title, String type, String author, int price) {

            this.title = title;
            this.type = type;
            this.author = author;
            this.price = price;
        }

        public void setInfo(){
            System.out.println("Book");
            System.out.println("Title : " +this.title);
            System.out.println("Type : " +this.type);
            System.out.println("Author : "+this.author);
            System.out.println("Price : "+this.price);

}



}
