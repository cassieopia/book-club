package com.cwang.bookclub.resource;

import com.cwang.bookclub.api.Book;
import com.cwang.bookclub.api.ImmutableBook;
import com.google.common.collect.Lists;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

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
}
