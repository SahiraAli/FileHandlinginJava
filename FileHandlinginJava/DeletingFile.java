
import java.io.File;
import java.io.IOException;

public class DeletingFile {
  public static void main(String[] args) {
    try{
      File fo;
      fo = new File("newfile2.txt");
      fo.createNewFile();
      if(fo.delete()){
        System.out.println(fo.getName());
      }
    }
    catch(IOException e){
      System.out.println(e.getMessage());
    }
  }
}
