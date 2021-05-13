package com.example;
import java.util.regex.Pattern;

public class SubstanceList implements Substance {
    private String[] ionsArray;
    private int[] charges;
    private double molecularWeight;
    private String name;

    public SubstanceList(String[] ions, double molecularWeight){
        ionsArray = new String[ions.length];
        charges = new int[ions.length];
        //parse andmed
        for (int i=0; i< ions.length; i++) {
            String el = ions[i];
            //fetch laeng
            char charge = el.charAt(el.length()-1);
            //eemaldan laengut
            String ionNoSign = el.substring(0, el.length() - 1);
            // Kui laeng on rohkem kui 1 
            if(Pattern.compile("[0-9]").matcher(el).find()){
                //fetch laeng
                int number  = Character.getNumericValue(ionNoSign.charAt(ionNoSign.length()-1));
                //eemaldan arvu
                charges[i] = (charge=='+')? number : -number ;
                //panen iooni massiivi
                String ion = ionNoSign.substring(0, ionNoSign.length() - 1);
                ionsArray[i] = ion;
            } else{
                //laeng on võrdne 1
                charges[i] = (charge=='+')? 1 : -1 ;
                //panen iooni massiivi
                ionsArray[i] = ionNoSign;
            }
        }

        // arvutan laengud, kui summa on võrdne 0, luuakse klassi aine eksemplar
        if(calculateCharges()==0){
            this.name = generateName();
            this.molecularWeight = molecularWeight;
        }

    }

    @Override
    public double calculateMass(Ion first, Ion second) {
        return 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getMolecularWeight() {
        return this.molecularWeight;
    }



    private int calculateCharges(){
        int sumCharges = 0;

        for(int c : charges){
            sumCharges+=c;
        }

        return sumCharges;
    }

    private String generateName(){
        // aine nime loomine
        // nõue: ioonide õige järjestus
        int count = 1;
        String firstIon = ionsArray[0];
        String name = firstIon;

        for(int i=1; i < ionsArray.length; i++){

            if(ionsArray[i].equals(firstIon)){
                count++;
            }else{
                if(count>1){
                    name+=""+count;
                    count = 1;
                } else{
                    name+=ionsArray[i];
                }

                firstIon = ionsArray[i];
            }
        }
        if(count>1){name+=""+count;}

        return name;

    }

}
