/*package Tests;

import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
           // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}

    

import java.io.*;
 
public class Program {
 
    public static void main(String[] args) {
        
        try(FileReader reader = new FileReader("notes3.txt"))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                 
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   
    } 
}
*/