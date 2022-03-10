package quotes;

import java.util.ArrayList;
import java.util.List;

public class Book {
    public String author,quotes;



    public Book(String author, String quotes) {
        this.author = author;
        this.quotes = quotes;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", quotes='" + quotes + '\'' +
                '}';
    }
}
