package csv_parsing;
import org.apache.commons.csv.*;import java.io.*;
public class CommonsCSVParser{
 public static int count(String p)throws Exception{
  try(Reader in=new FileReader(p)){
   Iterable<CSVRecord> rec=CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
   int c=0; for(CSVRecord r:rec)c++; return c;
  }
 }
}