/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.github.cliftonlabs.json_simple.JsonException;

import java.io.*;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException, JsonException {
        APIQuotes test = new APIQuotes();
        test.quotes();


    }


}
