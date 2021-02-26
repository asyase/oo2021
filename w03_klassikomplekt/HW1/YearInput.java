package HW1;
import java.util.*; 
import java.util.Scanner;

public class YearInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programmiga leiate kas antud aasta on liigaasta.");
		System.out.println("Sisestage aasta:");
        int year = sc.nextInt(); //Scanner loeb sisse täisarvu
        YearOutput.longYear(year);
        sc.close();
    }
}
    

