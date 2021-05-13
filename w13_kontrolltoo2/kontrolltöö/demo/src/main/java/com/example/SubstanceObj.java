package com.example;



public class SubstanceObj implements Substance {
    private String name;
    private double molecularWeight;

    SubstanceObj(Ion first, Ion second){
        Ion posititveEl = null;
        Ion negativeEl = null;

        if(first.getCharge() > second.getCharge()){
            posititveEl = first;
            negativeEl = second;
        }
        if(first.getCharge()+second.getCharge()==0){
              this.name = posititveEl.getName()+""+negativeEl.getName();
              this.molecularWeight = calculateMass(posititveEl, negativeEl);
        }
    }

    public double calculateMass(Ion first, Ion second){
        return first.getMass()+second.getMass();
        }

    public String getName() {
        return this.name;
    }

    public double getMolecularWeight() {
        return this.molecularWeight;
    }
}
