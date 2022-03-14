package quotes;

import com.google.gson.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class QuotesClass {


    public String GetQuotes() throws IOException {
        RandomQuotes out = null;
        Reader reader = Files.newBufferedReader(Paths.get("Data.json"));
        JsonElement jsonElement = JsonParser.parseReader(reader);
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        Random random = new Random();
        int RandomInteger = random.nextInt(jsonArray.size() - 1);
        Gson gson = new Gson();
        out = gson.fromJson(jsonArray.get(RandomInteger), RandomQuotes.class);
        System.out.println(out);
        return out.toString();
    }

    public JsonArray readJasonFile() throws IOException {
        RandomQuotes out = null;
        Reader reader = Files.newBufferedReader(Paths.get("Data.json"));
        JsonElement jsonElement = JsonParser.parseReader(reader);
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        return jsonArray;
    }

    public void AddObject(RandomQuotes quotes) throws IOException {
        JsonArray array = readJasonFile();
        Gson gson = new Gson();
        JsonObject quotesOB = new JsonObject();
        quotesOB.addProperty("quotes", quotes.getQuotes());
        quotesOB.addProperty("author", quotes.getAuthor());
        array.add(quotesOB);
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("Data.json"));
            writer.write(gson.toJson(array));
            writer.close();
        } catch (Exception e) {
            System.out.println(e);

        }


    }

}
