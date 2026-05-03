package csv_parsing;
import org.testng.Assert;import org.testng.annotations.Test;
public class TestCSV{
 @Test public void testAll() throws Exception{
  String p="src/main/resources/students.csv";
  Assert.assertEquals(SplitParser.count(p),5);
  Assert.assertEquals(ScannerParser.count(p),5);
  Assert.assertEquals(OpenCSVParser.count(p),5);
  Assert.assertEquals(CommonsCSVParser.count(p),5);
 }
}