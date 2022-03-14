package quotes;

public class RandomQuotes {
    private  String author,text;


    public RandomQuotes(String author, String quotes) {
        this.author = author;
        this.text = quotes;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuotes() {
        return text;
    }

    @Override
    public String toString() {
        return "RandomQuotes{" +
                "author='" + author + '\'' +
                ", quotes='" + text + '\'' +
                '}';
    }
}
