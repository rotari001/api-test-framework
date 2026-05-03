package json_parsing;
import org.json.simple.*;import org.json.simple.parser.*;
import java.nio.file.*;import java.nio.charset.StandardCharsets;

public class JSONProcessor{
 public static JSONArray read(String p)throws Exception{
  return (JSONArray)new JSONParser().parse(Files.readString(Path.of(p)));
 }
 public static void modify(JSONArray arr){
  JSONObject o=(JSONObject)arr.get(0);
  o.put("grade",10.0);
 }
}