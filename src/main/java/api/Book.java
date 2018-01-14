package api;

/**
 * Created by baseb on 1/14/2018.
 */
public class Book {

    public Book() {
    }

    String bookTitle;
    String bookAuthor;
    String bookPublisher;
    String bookGenre;
    int bookDatePublished;
    int bookRating;
    int bookIsbn;

    //Book main constructor. ONLY data required is title
    public Book(String title){
        bookTitle = title;
    }


    //Following constructors are the individual getters and setters for the book characteristics
    public void setAuthor(String author){
        bookAuthor = author;
    }
    public String getAuthor(){
        return bookAuthor;
    }

    public void setPublisher(String publisher){
        bookPublisher = publisher;
    }
    public String getBookPublisher(){
        return bookPublisher;
    }

    public void setBookGenre(String genre){
        bookGenre = genre;
    }
    public String getBookGenre(){
        return bookGenre;
    }

    public void setBookDatePublished(int datePublished){
        bookDatePublished = datePublished
    }
    public int getBookDatePublished(){
        return bookDatePublished;
    }

    public void setBookRating(int rating){
        bookRating = rating;
    }
    public int getBookRating(){
        return bookRating;
    }

    public void setBookIsbn(int isbn){
        bookIsbn = isbn;
    }
    public int getBookIsbn(){
        return bookIsbn;
    }


    //prints ALL book characteristics
    public void printBook(){
        System.out.println("Title:"+ bookTitle );
        System.out.println("Author:" + bookAuthor );
        System.out.println("Publisher:" + bookPublisher );
        System.out.println("Genre:" + bookGenre);
        System.out.println("Date Published" + bookDatePublished);
        System.out.println("Rating:" + bookRating);
        System.out.println("ISBN:" + bookIsbn);

    }


    public static void main(String[] args) {
        System.out.println("Hello, Books!");
    }

}