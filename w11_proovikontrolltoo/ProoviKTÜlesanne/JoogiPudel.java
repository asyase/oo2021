//Koostan klassi nimetusega Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus

public class JoogiPudel {
    double maht;
    String pudelityyp;
    double mass;
    double taaraHind;
    Jook sisu;

    public JoogiPudel(String pudelityyp, double maht, double taaraHind, Jook sisu) {

        this.pudelityyp = pudelityyp;
        this.maht = maht;
        this.taaraHind = taaraHind;

        if (sisu != null) {
            this.sisu = sisu;
        } else {
            this.sisu = new Jook("Kanes", 1.3, 1.5);
        }
    }

    public JoogiPudel(JoogiPudel suur) {
    }

    public void lisaJook(Jook vedelik) {
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

