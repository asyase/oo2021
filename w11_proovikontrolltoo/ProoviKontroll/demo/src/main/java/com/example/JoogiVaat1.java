package com.example;

//Koostan klassi Joogivaat, millel on ruumala ning sees oleva Joogi kogus liitrites. 
//-----------------------------------------------------------------------------------
public class JoogiVaat1 {
    Jook1 vedelik;
    JoogiPudel1 pudel;
    double ruumala;
    double liitrid;

    public JoogiVaat1(double ruumala, double liitrid, Jook1 vedelik) {
        this.ruumala = ruumala;
        this.liitrid = liitrid;
        this.vedelik = vedelik;
    }

    // Käsk etteantud Joogipudeli täitmiseks (juhul kui Jooki jagub)
    // ----------------------------------------------------------------------------------
    public void pudeliTaitmine(JoogiPudel1 pudel) {
        if (liitrid > pudel.maht) {
            liitrid = liitrid - pudel.maht;
        } else {
            System.out.println("pole piisavat jooki");
        }
    }

    // Käsklus kogu Joogivaaditäie Joogi villimiseks Joogipudelitesse
    // -----------------------------------------------------------------------------------------
    public int vaadiTaitmine(JoogiPudel1 pudel) {
        int n = 0;
        while (liitrid >= pudel.maht) {
            n += 1;
            liitrid -= pudel.maht;
        }
        return n;
    }

}
