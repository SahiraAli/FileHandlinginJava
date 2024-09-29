
import java.io.*;

public class FileReading {
  public static void main(String[] args) {
    try{
      File fo = new File("newfile.txt");
      fo.createNewFile();
    }
    catch(IOException e){
      System.out.println(e.getMessage());
    }
    try (FileWriter fw = new FileWriter("newfile.txt")) {
            fw.write("Me encanta cuando me llamas señorita.");
        }
   catch(IOException e){
      System.out.println(e.getMessage());
    }
    try{
        try (FileReader fr = new FileReader("newfile.txt")) {
            int c = fr.read();
            
            while (fr.ready()) {
                System.out.println((char) c);  //prints each letter on a singke line to avoid this use "print()"
                c = fr.read(); 
            }
        }
    }
    catch(IOException e){
      System.out.println(e.getMessage());
    }
}
}
