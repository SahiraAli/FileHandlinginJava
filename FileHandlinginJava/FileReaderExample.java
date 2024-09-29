import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
  public static void main(String[] args) {
    try (FileReader fr = new FileReader("note.txt")) {
            int c = fr.read();

            while (fr.ready()) {
                System.out.println((char) c);  //prints each letter on a singke line to avoid this use "print()"
                c = fr.read(); 
            }

        } 
        catch (IOException e) {
            System.out.println(e.getMessage()); 
        }

        System.out.println(); 
    }
  }

