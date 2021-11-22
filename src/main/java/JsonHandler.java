import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonHandler {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("C:\\dev\\Java-Todoist-Connector\\src\\main\\java\\data.json")) {

            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray recipeList = (JSONArray) obj;
            System.out.println("Here is the recipe" + recipeList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
