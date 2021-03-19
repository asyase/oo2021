package HW2;
import java.util.*;
import java.text.DecimalFormat;


public class Converter {

    public static void main(String[] args){
        DecimalFormat dgr = new DecimalFormat("##.###"); // mmääran sissetulevate numbrite vormindamise kuju
        Scanner sc = new Scanner(System.in);
	    System.out.println("Sisesta kuidas tahad konvertida: \n 1. Fahrenheit ----> Celsius\n 2. Celsius ----> Fahrenheit\n 3. Celsius -----> Kelvin\n 4. Fahrenheit ------> Kelvin");
        System.out.println();
        int sisend = sc.nextInt();
        
        if (sisend == 1){
            System.out.println();
            System.out.println("Sisestage Fahrenheitid:");
            System.out.println();
            double fahrenheit = sc.nextDouble();
            sc.close();
            Main cels = new Rules();
            System.out.println();
            System.out.println(fahrenheit + " fahrenheiti on " + dgr.format(cels.celsius(fahrenheit)) + " celsiust.");

        }else if (sisend == 2){
            System.out.println();
            System.out.println("Sisestage Celsiused:");
            System.out.println();
            double celsius = sc.nextDouble();
            sc.close();
            Main fahr = new Rules();
            System.out.println();
            System.out.println(celsius + " celsiust on " + dgr.format(fahr.fahrenheit(celsius)) + " fahrenheiti.");

        }else if (sisend == 3){
            System.out.println();
            System.out.println("Sisestage Celsiused:");
            System.out.println();
            double celsius = sc.nextDouble();
            sc.close();
            Main celsius_to_kelvin = new Rules();
            System.out.println();
            System.out.println(celsius + " celsiust on " + dgr.format(celsius_to_kelvin.celsius_to_kelvin(celsius)) + " kelvinit.");

        }else if (sisend == 4){
            System.out.println();
            System.out.println("Sisestage Fahrenheitid:");
            System.out.println();
            double f = sc.nextDouble();
            sc.close();
            Rules fahrenheit_to_kelvin = new Rules();
            System.out.println();
            System.out.println(f + " fahrenheiti on " + dgr.format(fahrenheit_to_kelvin.fahrenheit_to_kelvin(f)) + " kelvinit.");
        }
    }
}
