import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamExample {
  public static void main(String[] args) {
    try (OutputStreamWriter osw = new OutputStreamWriter(System.out)){
      osw.write(54);
      osw.write('\n');
      osw.write(97);
      osw.write(10);
      char[] arr = "hello there".toCharArray();
      osw.write(arr);
    }
    catch(IOException e){
      System.out.println(e.getMessage());
    }
  }
}
