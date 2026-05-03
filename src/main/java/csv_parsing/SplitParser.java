package csv_parsing;
import java.nio.file.*;import java.nio.charset.StandardCharsets;
public class SplitParser{
 public static int count(String p)throws Exception{
  return Files.readAllLines(Path.of(p),StandardCharsets.UTF_8).size()-1;
 }
}