
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingFile {
  public static void main(String[] args) {
      try{
        File fo = new File("newfile.txt");
        fo.createNewFile();
      }
      catch(IOException e){
        System.out.println(e.getMessage());
      }
      try{
          try (FileWriter fw = new FileWriter("newfile.txt")) {
              fw.write("Me encanta cuando me llamas señorita.");
          }
      }
      catch(IOException e){
        System.out.println(e.getMessage());
      }
  }
}
