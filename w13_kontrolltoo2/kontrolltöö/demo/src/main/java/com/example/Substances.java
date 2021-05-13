package com.example;


public class Substances {
    Ions ions = new Ions();

    public Substance createSodiumChloride(){
        Ion sodium = ions.createSodium();
        Ion chlorine = ions.createChlorine();
        return new SubstanceObj(sodium, chlorine);
    }

    public Substance createCalciumOxide(){
        Ion calcium = ions.createCalcium();
        Ion oxide = ions.createOxide();
        return new SubstanceObj(calcium, oxide);
    }

    public Substance createCalciumSingleChloride(){
        Ion calcium = ions.createCalcium();
        Ion chlorine = ions.createChlorine();
        return new SubstanceObj(calcium, chlorine);
    }

}
