import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

//loeme  andmeid adressilt, internetist

public class OnlineRW {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
      new InputStreamReader( //kutsub jadana 
        new URL("http://www.tlu.ee/~ray/lengths.txt").openStream()));
    
    PrintWriter pw = new PrintWriter(new FileWriter("answer.txt"));

    String line = br.readLine(); //saame katte line
    String[] lineData = line.split(" ");

    System.out.println(line);
    System.out.println(sum(lineData));
    System.out.println(average(lineData));

    pw.println("Sum is " + sum(lineData));
    pw.println("Average is " + average(lineData));

    br.close();
    pw.close();
  }

  public static int sum(String[] input){
    int sum = 0;
    for (String data : input){
      sum += Integer.parseInt(data);
    }
    return sum;
  }

  public static double average(String[] input){
    return sum(input) / input.length;
  }
}