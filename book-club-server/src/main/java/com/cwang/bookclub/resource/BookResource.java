package com.cwang.bookclub.resource;

import com.cwang.bookclub.api.Book;
import com.cwang.bookclub.api.ImmutableBook;
import com.google.common.collect.Lists;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.ArrayList;
import javax.ws.rs.PathParam;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    final private List<Book> bookList;

    public BookResource (){  //placehold constructor for testing other api endpoints
        this.bookList = Lists.newArrayList(
                ImmutableBook.builder()
                        .id(0l)
                        .title("The Goldfinch")
                        .author("Donna Tartt")
                        .rating(4)
                        .addIsbn("9783442312399")
                        .build(),
                ImmutableBook.builder()
                        .id(1l)
                        .title("Harry Potter and the Sorcerer's Stone")
                        .author("J.K. Rowling")
                        .rating(5)
                        .addIsbn("9788700631625")
                        .build()
        );
    }

    @GET
    public List<Book> getBooks() {
        return Lists.newArrayList(
                ImmutableBook.builder()
                        .id(0l)
                        .title("The Goldfinch")
                        .author("Donna Tartt")
                        .rating(4)
                        .addIsbn("9783442312399")
                        .build(),
                ImmutableBook.builder()
                        .id(1l)
                        .title("Harry Potter and the Sorcerer's Stone")
                        .author("J.K. Rowling")
                        .rating(5)
                        .addIsbn("9788700631625")
                        .build()
        );

    }


    @Path("/getAuthors") //returns list of authors
    @GET
    public List<String> getAuthors() {

            ArrayList<String> authorList = new ArrayList<String>();

            for(Book book : bookList){
                authorList.add(book.author());
            }
            return authorList;
    }

    @Path("/getTitles") //returns list of book titles on record
    @GET
    public List<String> getTitles() {

        ArrayList<String> titleList = new ArrayList<String>();

        for(Book book : bookList){
            titleList.add(book.title());
        }
        return titleList;
    }

    @Path("/info/isbn/{isbn}") //search books by isbn
    @GET
    public Book getInfoIsbn(@PathParam("isbn") List isbn) {

        for(Book book : bookList){
            if(book.isbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }


    @Path("/info/title/{title}") //search books by book title
    @GET
    public Book getInfoTitle(@PathParam("title") String title) {

        for(Book book : bookList){
            if(book.title().equals(title)){
                return book;
            }
        }
        return null;
    }

}