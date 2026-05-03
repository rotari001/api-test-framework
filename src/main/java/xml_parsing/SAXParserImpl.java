package xml_parsing;
import javax.xml.parsers.*;import org.xml.sax.helpers.DefaultHandler;
public class SAXParserImpl{
 public static void parse(String p)throws Exception{
  SAXParserFactory.newInstance().newSAXParser().parse(p,new DefaultHandler());
 }
}