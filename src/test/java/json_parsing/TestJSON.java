package json_parsing;
import org.testng.Assert;import org.testng.annotations.Test;
public class TestJSON{
 @Test public void testJSON() throws Exception{
  var arr=JSONProcessor.read("src/main/resources/students.json");
  JSONProcessor.modify(arr);
  Assert.assertTrue(arr.size()>0);
 }
}