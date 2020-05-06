package com.codeup.reviewlister;
import com.codeup.reviewlister.Quote;
import java.util.List;

public interface Quotes {
    List<Quote> all(); //get a list of all the quotes
    Long insert(Quote quote); //insert a new quote and return the new quote's id
}
