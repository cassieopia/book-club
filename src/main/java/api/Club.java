package api;

import java.util.List;

/**
 * Created by nickwang3 on 1/14/2018.
 */

@Value.Immutable
@JsonSerialize(as = ImmutableClub.class)
@JsonDeserialize(as = ImmutableClub.class)

public interface Club {


     Long id();

     String name();

     Genre genre();

     String type(); //public or private group

     int size();

     List<Book> readList();


 }
