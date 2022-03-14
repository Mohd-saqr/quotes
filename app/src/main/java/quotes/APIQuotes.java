package quotes;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class APIQuotes {
    public String quotes() throws IOException {
        URL link = new URL("https://ron-swanson-quotes.herokuapp.com/v2/quotes/1");
        QuotesClass quotesClass = new QuotesClass();
        String[] authorArray = new String[]{"Kamora Schmitt",
                "Ulises Moore",
                "Jaslene Wood",
                "Keshawn Stewart",
                "Maya Espinoza",
                "Mattie Krause",
                "Chloe Salinas",
                " Lena Roy",
                "Maggie Vaughn",
                "Caleb Shaw",
                "Abraham Sandoval",
                "Nathaly Bowers"};
        Random random = new Random();
        int index = random.nextInt(authorArray.length - 1);
        String author = authorArray[index];
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setRequestMethod("GET");
            InputStreamReader input = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader Reader = new BufferedReader(input);
            String out = Reader.readLine();
            out = out.replace("[", "").replace("]", "").replace('"', ' ').replace('"', ' ');
            RandomQuotes randomQuotes = new RandomQuotes(author, out);
            quotesClass.AddObject(randomQuotes);
            System.out.println(randomQuotes);
            return randomQuotes.toString();
        } catch (Exception e) {
            return quotesClass.GetQuotes();
        }

    }

    // this method added for test , the same original method but without add
    public String quotesForTEST1() throws IOException {
        URL link = new URL("https://ron-swanson-quotes.herokuapp.com/v2/quotes/1");
        QuotesClass quotesClass = new QuotesClass();
        String[] authorArray = new String[]{"Kamora Schmitt",
                "Ulises Moore",
                "Jaslene Wood",
                "Keshawn Stewart",
                "Maya Espinoza",
                "Mattie Krause",
                "Chloe Salinas",
                " Lena Roy",
                "Maggie Vaughn",
                "Caleb Shaw",
                "Abraham Sandoval",
                "Nathaly Bowers"};
        Random random = new Random();
        int index = random.nextInt(authorArray.length - 1);
        String author = authorArray[index];
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setRequestMethod("GET");
            InputStreamReader input = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader Reader = new BufferedReader(input);
            String out = Reader.readLine();
            out = out.replace("[", "").replace("]", "").replace('"', ' ').replace('"', ' ');
            RandomQuotes randomQuotes = new RandomQuotes(author, out);
            System.out.println(randomQuotes);
            return randomQuotes.toString();
        } catch (Exception e) {
            return quotesClass.GetQuotes();
        }

    }
}
