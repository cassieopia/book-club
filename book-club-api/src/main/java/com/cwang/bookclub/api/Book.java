package com.cwang.bookclub.api;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableBook.class)
@JsonDeserialize(as = ImmutableBook.class)
public interface Book {

    Long id();

    String title();

    String author();

    Optional<String> publisher();

    Optional<String> genre();

    Optional<String> datePublished();

    int rating();

    List<String> isbn();

}
