
import org.json.JSONObject;
import org.json.JSONArray;

public class EjemploParse {
        public static void main(String args[]){
            String cadenaJson ="{\n" +
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
                    "                \"comments\": [{\"comment\":\"Muy Bueno\"},{\"comment\":\"Bueno, más o menos\"}],\n" +
                    "                \"time_of_post\": \"1234567890\"\n" +
                    "            },\n" +
                                " {\n" +
                    "              \"post_id\": \"9876543210\",\n" +
                    "                \"actor_id\": \"2002\",\n" +
                    "                \"author_name\": \"Jane Doe\",\n" +
                    "                \"post_title\": \"How to parse JSON in Java\",\n" +
                    "                \"comments\": [{\"comment\":\"GENIAAAL!!\"},{\"comment\":\"Eres un crack\"}],\n" +
                    "                \"time_of_post\": \"9876543210\"\n" +
                    "            }\n" +
                    "    ]\n" +
                    "}";
            JSONObject jo = new JSONObject(cadenaJson);

            String pageInfo= jo.getJSONObject("pageInfo").getString("pageName");
            System.out.println(pageInfo);

            JSONArray arr = jo.getJSONArray("posts");
                for (int i = 0; i < arr.length(); i++) {
                String post_id = arr.getJSONObject(i).getString("post_id");
                System.out.println("Post_ID: "+post_id);
                JSONArray comment = arr.getJSONObject(i).getJSONArray("comments");
                for (int j = 0;j<comment.length();j++){

                    String com = comment.getJSONObject(j).getString("comment");
                    System.out.println("Comentario "+(j+1)+": " +com);
                }
                    System.out.println("\n");
            }
        }
}


