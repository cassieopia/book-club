package api;
import java.util.List;
package com.cwang.bookclub.api;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import java.util.Optional;
 @Value.Immutable
 @JsonSerialize(as = ImmutableBook.class)
 @JsonDeserialize(as = ImmutableBook.class)

/**
 * Created by nickwang3 on 1/14/2018.
 */
public interface Club {


     Long id();

     String name();

     Genre genre();

     String type(); //public or private group

     int size();

     List<Book> readList();


 }
