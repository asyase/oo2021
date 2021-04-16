package HW8second;

public class Huawei extends Phone {
    public Huawei(String model, String color, int cameraQuality) {
        super(model, color, cameraQuality);

    }

    @Override
    public void difference() {
        System.out.println(this.model + "omab multifunktsionaalsed neli kamerat");

    }

    @Override
    public void battery() {
        System.out.println(this.model + " töötab 2 päeva ilma aku laadimata");

    }

    @Override
    public void dislike() {
        System.out.println(this.model + "'il puudub Google Play tugi");

    }

}
