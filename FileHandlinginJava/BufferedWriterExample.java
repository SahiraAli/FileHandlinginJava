
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
  public static void main(String[] args) {
    try(BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))){
      bw.write("Changing the note again using buffered writer");
    }
    catch(IOException e){
      System.out.println(e.getMessage());
    }
  }
}
