package exam02_Optional;

public class Book {
    private int isbm;
    private String title;
    private String author;
    private String publisher;

    public Book(int isbm, String title, String author, String publisher) {
        this.isbm = isbm;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public int getIsbm() {
        return isbm;
    }

    public void setIsbm(int isbm) {
        this.isbm = isbm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbm=" + isbm +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
