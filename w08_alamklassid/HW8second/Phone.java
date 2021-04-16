package HW8second;

public abstract class Phone {
    public String model;
    public String color;
    public int cameraQuality;

    public Phone(String model, String color, int cameraQuality) {
        this.model = model;
        this.color = color;
        this.cameraQuality = cameraQuality;

    }

    public void phoneInfo() {

        System.out.println("Telefoni bränd on " + this.model + ", värv " + this.color + " ja kaamera kvaliteet "
                + this.cameraQuality + "Mpx");
    }

    public void rightNowIsCharging() {
        System.out.println(this.model + " hetkel laeb akut......");

    }

    public void phoneWasReleased(int year) {
        System.out.println(this.model + " loodi aastal " + year);

    }

    public abstract void difference();

    public abstract void battery();

    public abstract void dislike();
}
