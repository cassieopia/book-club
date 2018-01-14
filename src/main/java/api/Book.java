package api;

/**
 * Created by nickwang3 on 1/14/2018.
 */
public class Book {


    private String title;
    private String author;
    private String publisher;
    private String genre;
    private int datePublished;
    private int rating;
    private int isbn;

    //Book main constructor. ONLY data required is title
    public Book(String title){
        title = title;
    }


    //Following constructors are the individual getters and setters for the book characteristics
    public void setAuthor(String author){
        author = author;
    }
    public String getAuthor(){
        return author;
    }

    public void setPublisher(String publisher){
        publisher = publisher;
    }
    public String getBookPublisher(){
        return publisher;
    }

    public void setBookGenre(String genre){
        genre = genre;
    }
    public String getBookGenre(){
        return genre;
    }

    public void setBookDatePublished(int datePublished){
        datePublished = datePublished
    }
    public int getBookDatePublished(){
        return datePublished;
    }

    public void setBookRating(int rating){
        rating = rating;
    }
    public int getBookRating(){
        return rating;
    }

    public void setBookIsbn(int isbn){
        isbn = isbn;
    }
    public int getBookIsbn(){
        return isbn;
    }


    //toString for book class
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", genre='" + genre + '\'' +
                ", datePublished=" + datePublished +
                ", rating=" + rating +
                ", isbn=" + isbn +
                '}';
    }

    //prints ALL book characteristics
    public void printBook(){

        System.out.println(this.toString())

    }


    public static void main(String[] args) {
        System.out.println("Hello, Books!");
    }

}