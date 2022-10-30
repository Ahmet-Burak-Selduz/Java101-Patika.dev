public class Book implements Comparable<Book>{
    private String name;
    private int pageNumber;
    private String authorName;
    private int releaseDate;

    public Book(String name, int pageNumber, String authorName, int releaseDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }
    public String getAuthorName() {
        return authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }


    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
}
