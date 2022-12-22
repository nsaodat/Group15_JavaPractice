package BookTask;

public class BookShop {
    public static void main(String[] args) {

        EBook eBook = new EBook("The Perfect Crime", "Oyinkan Braithwaite", 17);
        AudioBook audioBook = new AudioBook("The Sounds of Crime", "Val Mcdermid", 15);

        System.out.println(eBook);
        System.out.println(audioBook);

        eBook.read();
        audioBook.listen();






    }
}
