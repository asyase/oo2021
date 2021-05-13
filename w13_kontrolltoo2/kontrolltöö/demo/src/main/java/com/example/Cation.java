package com.example;


public class Cation implements Ion{

    private String name;
    private double mass;
    private int charge;


    Cation(String name, double mass, int charge){
        this.name = name;
        this.mass = mass;
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return this.mass;
    }

    public int getCharge() {
        return this.charge;
    }


}
