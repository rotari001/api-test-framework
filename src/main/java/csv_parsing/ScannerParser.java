package csv_parsing;
import java.util.*;import java.io.*;
public class ScannerParser{
 public static int count(String p)throws Exception{
  int c=0; try(Scanner sc=new Scanner(new File(p))){
   sc.nextLine();
   while(sc.hasNextLine()){sc.nextLine();c++;}
  }
  return c;
 }
}