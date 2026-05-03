package xml_parsing;
import javax.xml.parsers.*;import org.w3c.dom.*;import java.io.File;
public class DOMParser{
 public static int count(String p)throws Exception{
  Document d=DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(p));
  return d.getElementsByTagName("student").getLength();
 }
}