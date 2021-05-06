package com.example;
// Koostan Joogipudelite Kasti jaoks klass. Väljadeks kastityyp, kastihind, kastimass ning pesade arv (mitu pudelit mahub) 

public class JoogiKast {

    String kastityyp;
    double kastihind;
    double kastimass;
    int pesasid;
    int n_pudelid;

    public JoogiKast(String kastityyp, double kastihind, double kastimass, int pesasid) {
        this.kastityyp = kastityyp;
        this.kastihind = kastihind;
        this.kastimass = kastimass;
        this.pesasid = pesasid;
    }

    // Teen käsklused kasti ja sinna kuuluvate pudelite ühise massi arvutamiseks
    // ----------------------------------------------------------------------------
    public double kastiKoguMass(JoogiPudel pudel) {
        double kastimass = (n_pudelid * pudel.leiaMass()) + this.kastimass;

        return kastimass;
    }

    // Teen käsklused kasti ja sinna kuuluvate pudelite omahinna arvutamiseks
    // ------------------------------------------------------------------------
    public double kastiKoguHind(JoogiPudel pudel) {
        double kastihind = (n_pudelid * pudel.leiaHind()) + this.kastihind;

        return kastihind;
    }

    // Teen käsklus Joogivaadist Kasti sisse pudelite täitmiseks
    // ------------------------------------------------------------------------------------
    public void pudeliteLisamine(JoogiPudel pudel) {
        n_pudelid += 1;
    }

    public void pudeliteLisamine(JoogiVaat vaat, JoogiPudel pudel) {
        while (vaat.liitrid >= pudel.maht) {
            vaat.liitrid -= pudel.maht;
            n_pudelid += 1;
        }

        if (n_pudelid >= pesasid) {
            n_pudelid = pesasid;
            System.out.println("Kast on praegu täis");
        }
    }
}
