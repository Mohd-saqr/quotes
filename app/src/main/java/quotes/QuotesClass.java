package quotes;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class QuotesClass {

    public Book quotes(String path) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String t = classLoader.getResource("Data.json").toString();
        String InputPath = t.replace("file:/C", "C");
        String readline = "";
        //// this line is extra for test
        if (path == "") {
            path = InputPath;
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                readline += line;
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] test = readline.split("},");
            Random random = new Random();
            int randonInteger = random.nextInt(138);
            if (randonInteger < test.length) {
                String p = test[randonInteger].replace("text", "quotes") + "}";
                Gson gson = new Gson();
                Book out = gson.fromJson(p, Book.class);
                System.out.println(out);
                return out;
        }
            return null;
    }

    public Book quotes() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String t = classLoader.getResource("Data.json").toString();
        String InputPath = t.replace("file:/C", "C");
        String readline = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(InputPath));
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                readline += line;
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] test = readline.split("},");
            Random random = new Random();
            int randonInteger = random.nextInt(138);
            String p = test[randonInteger].replace("text", "quotes") + "}";
            Gson gson = new Gson();
            Book out = gson.fromJson(p, Book.class);
            System.out.println(out);
            return out;
    }
}
