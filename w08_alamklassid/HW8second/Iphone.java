package HW8second;

public class Iphone extends Phone {
    public Iphone(String model, String color, int cameraQuality) {
        super(model, color, cameraQuality);
    }

    @Override
    public void difference() {
        System.out.println(this.model + "'iga võib ujuda 4 meetri sügavusel ja saada pilte " + cameraQuality
                + " -mega­piksli­se ülilainurgaga");
    }

    @Override
    public void battery() {
        System.out.println(this.model + " töötab üks päev ilma aku laadimata");
    }

    @Override
    public void dislike() {
        System.out.println(this.model + " ei meeldi inimestele, kuna brändi tõttu ta on liiga kallis");

    }

}
