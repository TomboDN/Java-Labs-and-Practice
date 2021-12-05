public class Book {
    private String author;
    private String genre;
    private String title;

    public Book(String author, String genre, String title){
        this.author = author;
        this.genre = genre;
        this.title = title;
    }
    public Book(String author, String title){
        this.author = author;
        this.title = title;
        genre = "unknown";
    }
    public Book(String title){
        this.title = title;
        author = "unknown";
        genre = "unknown";
    }
    public Book(){
        title = "unknown";
        author = "unknown";
        genre = "unknown";
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "A book called: "+this.title+" in genre: "+this.genre+" by: "+this.author;
    }
}
