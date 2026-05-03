package xml_parsing;
import org.testng.Assert;import org.testng.annotations.Test;
public class TestXML{
 @Test public void testDOM() throws Exception{
  Assert.assertEquals(DOMParser.count("src/main/resources/students.xml"),2);
 }
}