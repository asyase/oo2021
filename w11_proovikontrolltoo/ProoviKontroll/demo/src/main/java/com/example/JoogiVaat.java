package com.example;

//Koostan klassi Joogivaat, millel on ruumala ning sees oleva Joogi kogus liitrites. 
//-----------------------------------------------------------------------------------
public class JoogiVaat {
    Jook vedelik;
    JoogiPudel pudel;
    double ruumala;
    double liitrid;

    public JoogiVaat(double ruumala, double liitrid, Jook vedelik) {
        this.ruumala = ruumala;
        this.liitrid = liitrid;
        this.vedelik = vedelik;
    }

    // Käsk etteantud Joogipudeli täitmiseks (juhul kui Jooki jagub)
    // ----------------------------------------------------------------------------------
    public void pudeliTaitmine(JoogiPudel pudel) {
        if (liitrid > pudel.maht) {
            liitrid = liitrid - pudel.maht;
        } else {
            System.out.println("pole piisavat jooki");
        }
    }

    // Käsklus kogu Joogivaaditäie Joogi villimiseks Joogipudelitesse
    // -----------------------------------------------------------------------------------------
    public int vaadiTaitmine(JoogiPudel pudel) {
        int n = 0;
        while (liitrid >= pudel.maht) {
            n += 1;
            liitrid -= pudel.maht;
        }
        return n;
    }

}
