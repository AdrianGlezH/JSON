import org.json.JSONArray;
import org.json.JSONObject;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class parseoJSON {
    static String json = "{\n" +
            "    \"pageInfo\": {\n" +
            "            \"pageName\": \"Homepage\",\n" +
            "            \"logo\": \"https://www.example.com/logo.jpg\"\n" +
            "    },\n" +
            "    \"posts\": [\n" +
            "            {\n" +
            "                \"post_id\": \"0123456789\",\n" +
            "                \"actor_id\": \"1001\",\n" +
            "                \"author_name\": \"Jane Doe\",\n" +
            "                \"post_title\": \"How to parse JSON in Java\",\n" +
            "                \"comments\": [\"Buenas tardes\", \"Buenos dias\"],\n" +
            "                \"time_of_post\": \"1234567890\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"post_id\": \"0987654321\",\n" +
            "                \"actor_id\": \"2002\",\n" +
            "                \"author_name\": \"Joe Mama\",\n" +
            "                \"post_title\": \"Como parsear un JSON en Java\",\n" +
            "                \"comments\":[\"Buenas tardes\", \"Buenos dias\"],\n" +
            "                \"time_of_post\": \"0987654321\"\n" +
            "            }\n" +
            "    ]\n" +
            "}";
    public static void main(String[] args) {
        System.out.println("holax");
        JSONObject obj = new JSONObject(json);
        String pageName = obj.getJSONObject("pageInfo").getString("pageName");

        System.out.println(pageName);
        System.out.println("cosas");
        JSONArray arr = obj.getJSONArray("posts");

        System.out.println("hola0");
        for (int i = 0; i < arr.length(); i++) {
            System.out.println("hola");
            String post_id = arr.getJSONObject(i).getString("post_id");
            System.out.println("hola2");
            String comments = arr.getJSONObject(i).getString("comments");
            System.out.println(post_id);
            System.out.println(comments);
        }
    }
}

