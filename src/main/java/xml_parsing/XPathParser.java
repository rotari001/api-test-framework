package xml_parsing;
import javax.xml.xpath.*;import org.w3c.dom.*;import javax.xml.parsers.*;import java.io.File;
public class XPathParser{
 public static int countHigh(String p)throws Exception{
  Document d=DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(p));
  XPath xp=XPathFactory.newInstance().newXPath();
  return ((NodeList)xp.evaluate("//student[grade>8]",d,XPathConstants.NODESET)).getLength();
 }
}