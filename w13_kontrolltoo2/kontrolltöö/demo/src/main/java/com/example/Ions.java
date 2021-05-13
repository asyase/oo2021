package com.example;
public class Ions {

    public Ion createHydron(){
        return new Cation("H", 1.007825, +1);
    }

    public Ion createNitrate(){
        return new Anion("NO", 62.0049, -1);
    }

    public Ion createSodium(){
        return new Cation("Na", 22.98977,+1);
    }

    public Ion createChlorine(){
        return new Anion("Cl", 35.453, -1);
    }

    public Ion createCalcium(){
        return new Cation("Ca", 40.078,+2);
    }

    public Ion createOxide(){
        return new Anion("O", 15.999, -2);
    }
}
