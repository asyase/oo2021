package com.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        try {
            File ionList = new File("demo/src/main/java/com/example/ions.txt");
            Scanner reader = new Scanner(ionList);
            //loen andmed failist line by line
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] spl_data = data.split(";");
                //jagan rida tulemise järgi, et saada üksiku elemendi nimi ja laengut
                double mweight = Double.parseDouble(spl_data[1]);
                String[] ions = spl_data[0].split(",");
                Substance substance = new SubstanceList(ions, mweight);
                // prindin loodud aine andmed
                System.out.println("Aine: "+substance.getName());
                System.out.println("Molekulmass: "+substance.getMolecularWeight());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
