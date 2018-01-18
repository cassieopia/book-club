package com.cwang.bookclub.api;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;


@Value.Immutable
@JsonSerialize(as = ImmutableClub.class)
@JsonDeserialize(as = ImmutableClub.class)

public interface Club {


    Long id();

    String name();

    Optional<Genre> genre();

    String type(); //public or private group

    int size();

    Optional<List<Book>> readList();


}
