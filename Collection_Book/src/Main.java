import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> bookList1 = new TreeSet<>();
        Book book1 = new Book("Suç ve Ceza",132,"Dostoyevski", 2000);
        Book book2 = new Book("İnce Memed",90,"Yaşar Kemal", 1987);
        Book book3 = new Book("Martin Eden",150,"Jack London", 1978);
        Book book4 = new Book("Şeker Portakalı",80,"Jose Mauro", 1999);
        Book book5 = new Book("Uçurtma Avcısı",120,"Khalled Hosseini", 2001);
        bookList1.add(book1);
        bookList1.add(book2);
        bookList1.add(book3);
        bookList1.add(book4);
        bookList1.add(book5);

        for (Book books : bookList1) {
            System.out.println("Kitap Adı : " + books.getName() + "\t Sayfa Sayısı : " + books.getPageNumber());
        }
        System.out.println("------------------------");
        Set<Book> bookList2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
        bookList2.add(book1);
        bookList2.add(book2);
        bookList2.add(book3);
        bookList2.add(book4);
        bookList2.add(book5);
        for (Book books : bookList2) {
            System.out.println("Kitap Adı : " + books.getName()  + "\t Sayfa Sayısı : " + books.getPageNumber());
        }
    }
}
