package csv_parsing;
import com.opencsv.CSVReader;import java.io.FileReader;
public class OpenCSVParser{
 public static int count(String p)throws Exception{
  try(CSVReader r=new CSVReader(new FileReader(p))){
   return r.readAll().size()-1;
  }
 }
}