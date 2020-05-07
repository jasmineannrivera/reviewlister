package com.codeup.reviewlister;
import com.codeup.reviewlister.Quote;
// this is the dao gurl!
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class QuotesDao {
    //a db driver is something that connects to the database
    private Connection connection = null;
    //db driver using Config info to access the data
    public QuotesDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }
//this is a method to get ALL the quotes
    public List<Quote> all() {
        //arraylist of quotes declared, initially empty
        List<Quote> quotes = new ArrayList<>();
        //mysql query to select all quotes from quote table
        String query = "SELECT * FROM quotes";

        try {
            //the statement is the actual connection to the db
            Statement st = connection.createStatement();
            // result set is what comes back from the mysql query
            ResultSet rs = st.executeQuery(query);
        //this loop is looking through the resultset and adding each quote to the arraylist
            while (rs.next()) {
                quotes.add(
                    new Quote(
                            //gets long from column labeled id
                        rs.getLong("id"),
                        rs.getString("author"),
                        rs.getString("quote")
                    )
                );
            }
    //if it fails it will print big block of words
        } catch (SQLException e) {
            e.printStackTrace();
        }
    //returns arraylist of quotes yay!
        return quotes;

    }
// method that returns a rando quote
    public Quote random() {
        //uses all method to get quotes and store them in an arraylist called quotes
        List<Quote> quotes = all();
        // random int between 0 and how many quotes there are
        int randomIndex = (int) Math.floor(Math.random() * quotes.size());
        //returns a quote by getting the quote with the index of whatever randomIndex is
        return quotes.get(randomIndex);
    }
}
