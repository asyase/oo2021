package com.example;

public class Main1 {

    public static void main(String[] arg) {
        Jook1 j1 = new Jook1("Kanes", 1.1, 0.5);
        JoogiPudel1 p1 = new JoogiPudel1("Plastik", 0.2, 0.1, j1);
        JoogiVaat1 v1 = new JoogiVaat1(6, 80, j1);
        JoogiKast1 k1 = new JoogiKast1("Klaas", 13.2, 3.0, 12);

        System.out.println("- Joogi nimi on " + j1.nimi);
        System.out.println("- Joogipudeli mass on " + p1.leiaMass());
        System.out.println("- Joogipudeli hind on  " + p1.leiaHind());
        System.out.println("- Joogivaadis joogikogus on " + v1.liitrid + "(liitrid)");
        v1.pudeliTaitmine(p1);
        System.out.println("- Vaadis joogi uus kogus liitrites on " + v1.liitrid);
        System.out.println("- Täidetud pudelite kogus on " + v1.vaadiTaitmine(p1));
        System.out.println("- Jääk vaadis on " + v1.liitrid);
        System.out.println("- Pesasse mahub " + k1.pesasid + " pudelit");
        k1.pudeliteLisamine(p1);
        System.out.println("- Kasti kogu mass on " + k1.kastiKoguMass(p1));
        System.out.println("- Kasti hind on " + k1.kastiKoguHind(p1));
        System.out.println("- Täidetud pesade number on " + k1.pesasid);
    }
}
// Jook(String nimetus, double hind, double kaal ){
// Joogipudel(double pudelimaht, String tyyp, double pudelimass, float hind){
// Joogikast(double maht, String tyyp, double kmass, double hind)
