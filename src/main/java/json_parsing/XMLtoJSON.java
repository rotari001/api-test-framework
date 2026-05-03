package json_parsing;
import org.json.simple.*;import javax.xml.parsers.*;import org.w3c.dom.*;import java.io.File;

public class XMLtoJSON{
 public static JSONArray convert(String p)throws Exception{
  JSONArray arr=new JSONArray();
  Document d=DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(p));
  NodeList list=d.getElementsByTagName("student");
  for(int i=0;i<list.getLength();i++){
   Element e=(Element)list.item(i);
   JSONObject o=new JSONObject();
   o.put("name",e.getElementsByTagName("name").item(0).getTextContent());
   arr.add(o);
  }
  return arr;
 }
}