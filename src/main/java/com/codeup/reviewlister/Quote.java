package com.codeup.reviewlister;
// this is the model!!

// this is basically a db table representation
public class Quote {
    private String quote;
    private String author;
    private long id;

//I'm gonna add a zero argument constructor cause according to the curriculum there should be one
    public Quote() {}
// this is a constructor for when the quote already has an id (seeder added)
    public Quote(long id, String quote, String author) {
        this.id = id;
        this.quote = quote;
        this.author = author;
    }
//this is a constructor for when the quote does not have an id yet (user added)
    public Quote(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }
// below are our getters and setters
    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
