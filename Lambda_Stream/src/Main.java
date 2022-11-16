import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Kürk Mantolu Madonna", 80, "Sabahattin Ali", "15-10-1950"));
        bookList.add(new Book("Sineklerin Tanrısı", 100, "William Golding", "12-10-1950"));
        bookList.add(new Book("Kafamda Bir Tuhaflık", 120, "Orhan Pamuk", "01-06-1999"));
        bookList.add(new Book("Yabancı", 60, "Albert Camus", "11-11-2011"));
        bookList.add(new Book("Kırmızı Pazartesi", 250, "Gabriel Garcia", "12-12-2012"));
        bookList.add(new Book("Hayvan Çiftliği", 90, "George Orwell", "08-09-2010"));
        bookList.add(new Book("Simyacı", 100, "Paulo Coelho", "05-04-2003"));
        bookList.add(new Book("Suç ve Ceza", 80, "Fyodor Dostoyevski   ", "01-01-2001"));
        bookList.add(new Book("Şeker Portakalı", 105, "José Mauro De Vasconcelos", "09-12-1987"));
        bookList.add(new Book("1984", 182, "George Orwell", "05-04-1983"));
        Map<String, String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getName(), book.getAuthorName()));
        for (String i : bookMap.keySet()) {
            System.out.println("Book name : " + i + "\t Author name : " + bookMap.get(i));
        }
        System.out.println();
        List<Book> listBook = bookList.stream().filter(book -> book.getPageNumber() > 100).collect(Collectors.toList());
        listBook.stream().forEach(b -> System.out.println("Book name : " + b.getName() + "  " +
                "Page Number : " + b.getPageNumber() + "  " +
                "Author : " + b.getAuthorName() + "  " +
                "ReleaseDate : " + b.getReleaseDate()));
    }
}
