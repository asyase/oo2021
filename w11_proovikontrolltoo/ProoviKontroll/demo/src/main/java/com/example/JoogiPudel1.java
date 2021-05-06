package com.example;

//Koostan klassi nimetusega Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus

public class JoogiPudel1 {
    double maht;
    String pudelityyp;
    double mass;
    double taaraHind;
    Jook1 sisu;

    public JoogiPudel1(String pudelityyp, double maht, double taaraHind, Jook1 sisu) {

        this.pudelityyp = pudelityyp;
        this.maht = maht;
        this.taaraHind = taaraHind;

        if (sisu != null) {
            this.sisu = sisu;
        } else {
            this.sisu = new Jook1("Kanes", 1.3, 1.5);
        }
    }

    public JoogiPudel1(JoogiPudel1 suur) {
    }

    public void lisaJook(Jook1 vedelik) {
        sisu = vedelik;
    }
    // Leian joogipudeli massi koos Joogiga (juhul kui see olemas)
    // --------------------------------------------------------------------------------

    public double leiaMass() {
        if (sisu != null) {
            return mass + sisu.erikaal * maht;
        } else {
            return mass;
        }

    }

    // Leian sellise komplekti omahinna ka
    // -----------------------------------------------------------------
    public double leiaHind() {
        if (sisu != null) {
            return taaraHind + (sisu.liitrihind * maht);
        } else {
            return taaraHind;
        }

    }
}
