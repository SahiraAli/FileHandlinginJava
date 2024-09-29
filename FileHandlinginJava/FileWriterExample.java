
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
  public static void main(String[] args) {
    try(FileWriter fw = new FileWriter("note.txt", true)){
      fw.write(" This text will be appended with the note since true is used");
    }
    catch(IOException e){
      System.out.println(e.getMessage());
    }
  }
}
