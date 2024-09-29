import java.io.*;

public class BufferedReaderExample {
  public static void main(String[] args) {
    // System.out.println("Type anything");
    // try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
    //   System.out.print("You typed: " + br.readLine());
    // }
    // catch (IOException e){
    //   System.out.println(e.getMessage());
    // }

    try(BufferedReader br = new BufferedReader(new FileReader("note.txt"))){
      while(br.ready()){
        System.out.print(br.readLine());
      }
    }
    catch(IOException e){
      System.out.println(e.getMessage());
    }
  }
}
