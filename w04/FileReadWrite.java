import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * FileReadWrite
 */
public class FileReadWrite {
  public static void main(String[] args) throws IOException {
    File file = new File("dummy1.txt");
    File fileWrite = new File("out_dummy1.txt");//importime faili
    /* System.out.println(
      file.getName() + "\n" +
      file.isFile() + "\n" + 
      file.isDirectory() + "\n" + 
      file.isHidden() + "\n" + 
      file.lastModified()
    ); */

    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr); //loeme bufferreaderiga(ta kaib labi malu) rea kaupa

    String line = br.readLine();
    while (line != null){
      String[] lineData = line.split(",");
      System.out.println(lineData[0] + " | " + lineData[lineData.length-1]);
      /* System.out.println(line); */
      line = br.readLine();
    }

    fr.close();
    br.close();

    if (!fileWrite.exists()){
      fileWrite.createNewFile();
    }
    //kirjutame sisse

    PrintWriter pw = new PrintWriter(fileWrite); //sisse printime, 
    Scanner scanner = new Scanner(file); //scannime esimest faili

    while (scanner.hasNextLine()){ //kui failis on next line siis ta teeb midagi sellega
      String line2 = scanner.nextLine();
      String[] lineData = line2.split(",");
      pw.println(
        "Number is " + lineData[0] + 
        " and name is " + lineData[1] + 
        " and lang is " + lineData[2] + 
        " and year is " + lineData[3]
      );
    }

    scanner.close();
    pw.close();

    // Loete sisse numbrid failist ja arvutate summa 
    // ja trükite summa uude faili

    
  }
}
