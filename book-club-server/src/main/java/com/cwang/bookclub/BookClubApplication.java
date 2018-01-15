package com.cwang.bookclub;

import com.cwang.bookclub.resource.BookResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class BookClubApplication extends Application<BookClubConfiguration> {

    public static void main(String[] args) throws Exception {
        new BookClubApplication().run(args);
    }

    @Override
    public String getName() {
        return "Book Club Application";
    }

    @Override
    public void initialize(Bootstrap<BookClubConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(BookClubConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new BookResource());
    }
}
